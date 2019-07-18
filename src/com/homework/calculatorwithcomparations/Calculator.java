package com.homework.calculatorwithcomparations;

import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;

    public void getUserInput(){
        Scanner in = new Scanner(System.in);
        System.out.println("Type two integer numbers: ");
        num1 = in.nextInt();
        in.nextLine();
        num2 = in.nextInt();
        in.close();
    }

    public int check(){
        if(num1 > num2){
            return 1;
        }else if(num1 < num2){
            return -1;
        }else {
            return 0;
        }
    }

    public int sum(){
        return num1 + num2;
    }

    public String sumInfo(){
        return num1 + " is bigger than " + num2 + '\n'
                + "Number 1 and number 2 sum is " + sum();
    }

    public int multiply(){
        return num1*num2;
    }

    public String multiplyInfo(){
        return num1 + " is smaller than " + num2 + '\n'
                + "Result of multiplying is: " + multiply();
    }

    public int power(){
        return num1*num1;
    }

    public String powerInfo(){
        return num1 + " is equal to " + num2 + '\n'
                + num1 + " to second power is: " + power();
    }

    public String printCondition(){
        int check = check();
        switch (check){
            case 1:
                return sumInfo();
            case -1:
                return multiplyInfo();
            case 0:
                return powerInfo();
            default:
                return "Condition error!";
        }
    }
}
