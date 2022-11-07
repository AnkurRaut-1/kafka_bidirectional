package com.asssignment.Payment.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//
//import javax.persistence.Entity;
//import javax.persistence.Table;
//
//@Entity
//@Table(name="payment")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {

    private int orderId;
    private int userId;
    private int productId;
    private double amount;
    private String paymentStatus;

}
