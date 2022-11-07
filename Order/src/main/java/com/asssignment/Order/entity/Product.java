package com.asssignment.Order.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.Table;

//@Entity
//@Table(name="product")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
//
//    @Id
//    @GeneratedValue
    private int productId;
    private  String productName;
    private double price;
    private int qty;

}
