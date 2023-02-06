package com.example;

public class Main {
    public static void main(String[] args) {
        try {
            JavaExceptions.checkJopTitle("Fullstack");
        }
        catch (IllegalArgumentException e){
            e.printStackTrace();
        }
        JavaExceptions.salaryCalculator();
    }
}