package com.company.vaibhav;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        Calc calc = new Calc(); // Instance of Calc class
        double a = 0;
        double b = 0;

        String sign = "";

        double result = 0;

        System.out.println("Welcome to the console calculator!" + "\n");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter operand 1: ");
            a = Double.parseDouble(reader.readLine());
            System.out.print("Enter operand 2: ");
            b = Double.parseDouble(reader.readLine());
            System.out.print("Enter operator: ");
            sign = reader.readLine();
        } catch (NumberFormatException e) {
            System.out.println("This is not a number!");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Problem with reading your input!");
            e.printStackTrace();
        }

        switch(sign) {
            case "+":
                result = calc.add(a, b);
                break; // Break keyword sets the next operation to be performed to the first one that's out of switch
            case "-":
                result = calc.subtract(a, b);
                break;
            case "*":
                result = calc.multiply(a, b);
                break;
            case "/":
                result = calc.divide(a, b);
                break;
            default:
                System.out.println("Wrong sign!");
        }

        System.out.println("Answer is: " + result);
    }
}
