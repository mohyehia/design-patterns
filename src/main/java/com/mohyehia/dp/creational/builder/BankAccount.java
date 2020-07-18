package com.mohyehia.dp.creational.builder;

import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * Created by Mohamed.Yehia
 * Date: 7/18/2020
 * Time: 2:07 PM
 */
@ToString
public class BankAccount {
    @Getter
    private final int accountId;    // Required
    @Getter
    private final String name;
    @Getter
    private final String address;
    @Getter
    private final String branch;
    @Getter
    private final BigDecimal balance;

    public BankAccount(Builder builder) {
        this.accountId = builder.accountId;
        this.name = builder.name;
        this.address = builder.address;
        this.branch = builder.branch;
        this.balance = builder.balance;
    }


    static class Builder{
        private final int accountId;
        private String name;
        private String address;
        private String branch;
        private BigDecimal balance;

        public Builder(int accountId) {
            this.accountId = accountId;
        }

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder address(String address){
            this.address = address;
            return this;
        }

        public Builder branch(String branch){
            this.branch = branch;
            return this;
        }

        public Builder balance(BigDecimal balance){
            this.balance = balance;
            return this;
        }

        public BankAccount build(){
            return new BankAccount(this);
        }
    }
}
