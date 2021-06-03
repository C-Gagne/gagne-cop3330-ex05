/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex5;

public class App {
    public static void main(String[] args) {
        Numbers first = new Numbers();
        Numbers second = new Numbers();

        System.out.println("Enter the first number:");
        Double x = first.getNumber();

        System.out.println("Enter the second number:");
        Double y = second.getNumber();

        Double sum = x + y;
        Double difference = x -y;
        Double product = x*y;
        Double quotient = x/y;

        System.out.println(x + " + " + y + " = " + sum + "\n " + x + " - " + y + " = " + difference + "\n " + x + " * " + y + " = " + product + "\n " + x + " / " + y + " = " + quotient);


    }
}
