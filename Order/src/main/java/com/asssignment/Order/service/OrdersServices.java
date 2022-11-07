package com.asssignment.Order.service;

import com.asssignment.Order.common.TransactionRequest;
import com.asssignment.Order.common.TransactionResponse;
import com.asssignment.Order.entity.Product;
import com.asssignment.Order.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class OrdersServices {

    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;
    private String topic = "TopicDemoB";

    public void placeOrder(TransactionRequest transactionRequest){
//        Users user = new Users(1,"John",1000);
//        Product product = new Product(1,"RAM",500,1);
//        transactionRequest = new TransactionRequest(user,product);
        kafkaTemplate.send(topic,transactionRequest);
    }

    @KafkaListener(topics = "TopicDemoB",groupId = "group_json",containerFactory = "kafkaListenerContainerFactory")
    public void consume(@Payload TransactionResponse transactionResponse){
        System.out.println("Response: "+transactionResponse);
    }


//    @KafkaListener(topics = "Topic_payment")
//    public String consumeObj(TransactionResponse transactionResponse){
//
//        return "Payment";
//    }
}
