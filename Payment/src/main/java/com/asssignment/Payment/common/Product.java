package com.asssignment.Payment.common;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private int productId;
    private  String productName;
    private double price;
    private int qty;

}
