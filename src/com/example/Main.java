package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = s.next();
        JavaExceptions.setName(name);
        System.out.println("Please enter your  job title:");
        String jopTitle = s.next();
        JavaExceptions.setDesiredJob(jopTitle);
        try {
            JavaExceptions.checkJopTitle();
            JavaExceptions.salaryCalculator();
        }
        catch (IllegalArgumentException e){
            System.out.printf(e + "\nHello %s, the job title you provide %s is unknown to us, so we can’t calculate your salary in 5 years \n"  ,JavaExceptions.getName() ,JavaExceptions.getDesiredJob());
            System.out.println("\n The stack trace is:");
            e.printStackTrace();

        }

    }
}
