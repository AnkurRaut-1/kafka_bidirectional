package com.asssignment.Order.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.Table;

//@Entity
//@Table(name="users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {

//    @Id
//    @GeneratedValue
    private int userId;
    private String userName;
    private double balance;
}
