package com.mohyehia.dp.creational.builder;

import lombok.Getter;
import lombok.ToString;

/**
 * Created by Mohamed.Yehia
 * Date: 7/18/2020
 * Time: 1:19 PM
 */
@ToString
public class User {
    @Getter
    private final String firstName; // Required
    @Getter
    private final String lastName; // Required
    @Getter
    private final int age;  // Optional
    @Getter
    private final String phone; // Optional
    @Getter
    private final String address;  // Optional

    // We used getters for all fields but not setters for immutability

    private User(UserBuilder userBuilder){
        this.firstName = userBuilder.firstName;
        this.lastName = userBuilder.lastName;
        this.age = userBuilder.age;
        this.phone = userBuilder.phone;
        this.address = userBuilder.address;
    }

    public static class UserBuilder{
        public final String firstName;
        public final String lastName;
        private int age;
        private String phone;
        private String address;

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder age(int age){
            this.age = age;
            return this;
        }

        public UserBuilder phone(String phone){
            this.phone = phone;
            return this;
        }

        public UserBuilder address(String address){
            this.address = address;
            return this;
        }
        //Return the finally constructed User object
        public User build(){
            // validate user object before returning
            return new User(this);
        }
    }
}
