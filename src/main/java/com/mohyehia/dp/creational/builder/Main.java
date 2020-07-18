package com.mohyehia.dp.creational.builder;

import java.math.BigDecimal;

/**
 * Created by Mohamed.Yehia
 * Date: 7/18/2020
 * Time: 1:19 PM
 */
public class Main {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder("Mohammed", "Yehia")
                .age(26)
                .phone("012345475678")
                .address("Egypt")
                .build();
        System.out.println(user1);

        User user2 = new User.UserBuilder("Ahmed", "Yehia")
                .age(20)
                .build();
        System.out.println(user2);

        BankAccount bankAccount = new BankAccount.Builder(1000)
                .name("QNB Bank")
                .branch("Cairo Branch")
                .address("Nasr City - Cairo - Egypt")
                .balance(new BigDecimal(200000))
                .build();
        System.out.println(bankAccount);
    }
}
