/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex5;

import java.util.Scanner;

public class Numbers {
    public static Double getNumber()
    {
        Scanner newNumber = new Scanner(System.in);
        return Double.parseDouble(newNumber.nextLine());
    }
}
