package com.Bijoy;
//Q: Input currency in rupees and output in USD.
import java.util.Scanner;

public class CurrencyConvert {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value in Rs : ");
        float Rs = in.nextInt();
        float dollar = 0;
        if (Rs != 0) {
            dollar = (float) (Rs * 0.012); //dollar value according to current real time is 1 rs = 0.012 dollar
        }
        System.out.println("The value of Rs in Dollar is : " + dollar);

    }
}
