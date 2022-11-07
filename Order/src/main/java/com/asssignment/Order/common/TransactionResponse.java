package com.asssignment.Order.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TransactionResponse {
    private int orderId=1;
    private int userID;
    private int productId;
    private double amount;
    private String paymentStatus;
}
