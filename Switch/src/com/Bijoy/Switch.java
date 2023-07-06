package com.Bijoy;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter fruit name : ");
        String fruit = input.next();
        switch (fruit) {
            case "Mango" -> System.out.println("It's the King of Fruit");
            case "Apple" -> System.out.println("It's a good red fruit");
            case "Orange" -> System.out.println("It's a good round fruit");
            case "grapes" -> System.out.println("It's a good tinny fruit");
            default -> System.out.println("Enter a valid fruit name");
        }
    }
}
