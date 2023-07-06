package com.Bijoy;
//Q: Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter the Principal value : ");
        float p = in.nextFloat();
        System.out.print("Enter the rate of interest : ");
        float r = in.nextFloat();
        System.out.print("Enter the time period in year : ");
        float t = in.nextFloat();
        float SI = p * 1 + p * (r * t);
        System.out.println("The Simple interest is : "+SI);
    }
}
