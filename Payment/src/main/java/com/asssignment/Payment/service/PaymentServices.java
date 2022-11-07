package com.asssignment.Payment.service;

import com.asssignment.Payment.common.Product;
import com.asssignment.Payment.common.RequestFromOrder;
import com.asssignment.Payment.common.ResponseToOrder;
import com.asssignment.Payment.common.Users;
import com.asssignment.Payment.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServices {

    ResponseToOrder response = new ResponseToOrder();
    Users user;
    Product product;
    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;

    @KafkaListener(topics = "TopicDemoB",groupId = "group_json",containerFactory = "kafkaListenerContainerFactory")
    public void consume(@Payload RequestFromOrder requestFromOrder){
        user = requestFromOrder.getUser();
        product = requestFromOrder.getProduct();
        ResponseToOrder response = new ResponseToOrder();
        response.setUserID(user.getUserId());
        response.setProductId(product.getProductId());
        response.setAmount(product.getPrice()* product.getQty());
        response.setPaymentStatus(user.getBalance() < response.getAmount()?"Failure":"Success");
        System.out.println("Response: "+response);
        kafkaTemplate.send("TopicDemoB",response);
    }



}
