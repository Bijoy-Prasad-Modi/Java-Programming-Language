package com.Bijoy;

import java.util.Scanner;

public class Temp_Cnvert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temp value in celcious :");
        float tempC = input.nextFloat();
        float tempF = (tempC * 9/5) + 32 ;
        System.out.println(tempF);

    }
}
