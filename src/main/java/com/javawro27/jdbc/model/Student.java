package com.javawro27.jdbc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor


public class Student {

    private Long id;

    private String firstName;
    private String lastName;
    private double wzrost;
    private int age;

    private boolean alive;

}
