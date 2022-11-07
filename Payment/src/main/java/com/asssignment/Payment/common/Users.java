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
public class Users {

    private int userId;
    private String userName;
    private double balance;
}
