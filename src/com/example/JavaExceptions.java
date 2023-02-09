package com.example;

import java.util.Scanner;

public class JavaExceptions {

    private static String _name;
    private static String _desiredJob;
    static int fullstackSalary = 22000;
    static int backendSalary = 20000;
    static int frontendSalary = 18000;

    public static String getName() {
        return _name;
    }
    public static String getDesiredJob() {
        return _desiredJob;
    }
    public static void setName(String name) {
        _name = name;
    }
    public static void setDesiredJob(String desiredJob) {
        _desiredJob = desiredJob;
    }

    public static void checkJopTitle(){
        switch (_desiredJob){
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
        if (_desiredJob.equals("fullstack")) {
            System.out.printf("Hello %s with the job title %s you will earn in 5 years: " + (frontendSalary * 12 * 5) + "$", _name, _desiredJob);
        } else if (_desiredJob.equals("backend")) {
            System.out.printf("Hello %s with the job title %s you will earn in 5 years: " + (backendSalary * 12 * 5) + "$", _name, _desiredJob);
        } else if (_desiredJob.equals("frontend")) {
            System.out.printf("Hello %s with the job title %s you will earn in 5 years: " + (frontendSalary * 12 * 5) + "$", _name, _desiredJob);
        }
        else{
            throw new IllegalArgumentException();
        }
    }
}
