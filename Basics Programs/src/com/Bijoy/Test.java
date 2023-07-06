package com.Bijoy;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter any NUM : ");
        int a = in.nextInt();
        char b = (char) a ;  // Ascai values 65 to 90 : A to Z & 97 to 122 : a to z
        System.out.println(b);
    }
}
