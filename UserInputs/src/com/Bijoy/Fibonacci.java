package com.Bijoy;
/* To calculate Fibonacci Series up to n numbers.
A Fibonacci series in Java is a sequence of numbers such that every third number is equal to the sum of the previous two numbers.*/

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the range : ");        //first we are taking a int value
        int n = input.nextInt();                      // assigning the int value to int variable n
        int a = 0 , b = 1 , count = 2 ;

        while (count <=n){
            int temp = b ;
            b = b + a ;
            a = temp;
            count ++ ;
            System.out.println(b);
        }
    }
}
