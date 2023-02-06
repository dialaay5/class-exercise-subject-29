package com.example;

public class Main {
    public static void main(String[] args) {
        try {
            JavaExceptions.checkJopTitle("fullstack");
        }
        catch (IllegalArgumentException e){
            e.printStackTrace();
        }
        JavaExceptions.salaryCalculator();
    }
}
