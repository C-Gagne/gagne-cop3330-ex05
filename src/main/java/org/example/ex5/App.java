package org.example.ex5;

public class App {
    public static void main(String[] args) {
        Numbers first = new Numbers();
        Numbers second = new Numbers();

        System.out.println("Enter the first number:");
        Integer x = first.getNumber();

        System.out.println("Enter the second number:");
        Integer y = second.getNumber();

        Integer sum = x + y;
        Integer difference = x -y;
        Integer product = x*y;
        Integer quotient = x/y;

        System.out.println(x + " + " + y + " = " + sum);
        System.out.println(x + " - " + y + " = " + difference);
        System.out.println(x + " * " + y + " = " + product);
        System.out.println(x + " / " + y + " = " + quotient);

    }
}
