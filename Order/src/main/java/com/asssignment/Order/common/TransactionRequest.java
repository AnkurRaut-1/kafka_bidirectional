package com.asssignment.Order.common;

import com.asssignment.Order.entity.Product;
import com.asssignment.Order.entity.Users;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionRequest {
    private Users user;
    private Product product;

}
