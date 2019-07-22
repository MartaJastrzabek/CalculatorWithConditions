package com.homework.calculatorwithcomparations;

public class CalculatorTest {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        calc.getUserInput();
        System.out.println(calc.checkAndGetInfo());
    }
}
