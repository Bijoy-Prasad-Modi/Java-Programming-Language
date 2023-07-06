package com.Bijoy;
//Q:  Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
Scanner in = new Scanner (System.in);
        System.out.print("Enter the value of num1 & num2 : ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        if(num1>num2){
            System.out.println("The largest number is : "+num1);
        }
        else{
            System.out.println("The largest number is : "+num2);
        }

    }
}
