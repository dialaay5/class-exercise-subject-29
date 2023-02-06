package com.example;

import java.util.Scanner;

public class JavaExceptions {
    static int fullstackSalary = 22000;
    static int backendSalary = 20000;
    static int frontendSalary = 18000;

    public static void checkJopTitle(String jopTitle){
        switch (jopTitle){
            case "fullstack":
                System.out.println("the salary of Fullstack jop is : " + fullstackSalary + "$");
                break;
            case "backend":
                System.out.println("the salary of Backend jop is : " + backendSalary + "$");
                break;
            case "frontend":
                System.out.println("the salary of Frontend jop is : " + frontendSalary + "$");
                break;
            default:
                throw new IllegalArgumentException("The provided job title is unsupported");
        }
    }

    public static void salaryCalculator(){
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = s.next();
        System.out.println("Please enter your  job title:");
        String jopTitle = s.next();
        try {
            if (jopTitle.equals("fullstack")) {
                System.out.printf("Hello %s with the job title %s you will earn in 5 years: " + (frontendSalary * 12 * 5) + "$", name, jopTitle);
            } else if (jopTitle.equals("backend")) {
                System.out.printf("Hello %s with the job title %s you will earn in 5 years: " + (backendSalary * 12 * 5) + "$", name, jopTitle);
            } else if (jopTitle.equals("frontend")) {
                System.out.printf("Hello %s with the job title %s you will earn in 5 years: " + (frontendSalary * 12 * 5) + "$", name, jopTitle);
            }
            else{
                throw new IllegalArgumentException();
            }
        }
        catch (IllegalArgumentException e){
            System.out.printf(e + "\nHello %s, the job title you provide %s is unknown to us, so we can’t calculate your salary in 5 years"  ,name ,jopTitle);
        }
    }
}
