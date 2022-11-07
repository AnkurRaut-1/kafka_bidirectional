package com.asssignment.Payment.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ResponseToOrder {
    private int orderId=1;
    private int userID;
    private int productId;
    private double amount;
    private String paymentStatus;
}
