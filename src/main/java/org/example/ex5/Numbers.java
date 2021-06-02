package org.example.ex5;

import java.util.Scanner;

public class Numbers {
    public static Integer getNumber()
    {
        Scanner newNumber = new Scanner(System.in);
        return Integer.parseInt(newNumber.nextLine());
    }
}
