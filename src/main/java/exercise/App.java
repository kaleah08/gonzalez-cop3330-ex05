package exercise;

/*UCF COP3330 Fall 2021 Assignment 1 Solution
Copyright 2021 Kaleah Gonzalez */

import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the first number? ");
        String firstString = input.next();
        int firstNum = Integer.parseInt(firstString);

        System.out.print("what is the second number? ");
        String secondString = input.next();
        int secondNum = Integer.parseInt(secondString);

        int sum = firstNum + secondNum;
        int difference = firstNum - secondNum;
        int product = firstNum * secondNum;
        int quotient = firstNum / secondNum;

        System.out.println(firstNum + " + " + secondNum + " = " + sum + "\n" + firstNum + " - " + secondNum + " = " + difference + "\n" + firstNum + " * " + secondNum + " = " + product + "\n" + firstNum +" / " + secondNum + " = " + quotient );




    }
}
