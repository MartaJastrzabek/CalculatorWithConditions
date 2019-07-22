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

    public String checkAndGetInfo(){
        if(num1 > num2){
            return num1 + " is bigger than " + num2 + '\n'
                    + "Number 1 and number 2 sum is " + (num1 + num2);
        }else if(num1 < num2){
            return num1 + " is smaller than " + num2 + '\n'
                    + "Result of multiplying is: " + (num1*num2);
        }else {
            return num1 + " is equal to " + num2 + '\n'
                    + num1 + " to second power is: " + (num1*num1);

        }
    }

}
