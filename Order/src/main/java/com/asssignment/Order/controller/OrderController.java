package com.asssignment.Order.controller;

import com.asssignment.Order.common.TransactionRequest;
import com.asssignment.Order.service.OrdersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrdersServices ordersServices;

    @PostMapping("/placeOrder")
    private String placeOrder(@RequestBody TransactionRequest transactionRequest){
        ordersServices.placeOrder(transactionRequest);
        return "Order is processing...";
    }
}
