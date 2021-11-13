package com.kodilla.testing;

import calculator.Calculator;

public class TestingMain
{
    public static void main(String[] args)
    {
        System.out.println("Moduł 6. Wprowadzenie to testowania oprogramowania");

        Calculator calculator = new Calculator();

        double a = 100;
        double b = 50;

        double additionResult = calculator.add(a, b);

        if (additionResult == a + b)
        {
            System.out.println("Addition Works!");
        }
        else
        {
            System.out.println("Addition Error!");
        }

        double subtractionResult = calculator.subtract(a, b);

        if (subtractionResult == a - b)
        {
            System.out.println("Subtraction Works!");
        }
        else
        {
            System.out.println("Subtraction Error");
        }

    }
}

