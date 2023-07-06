package com.Bijoy;

import java.util.Scanner;

//Q : Sum Of A Digits Of Number
public class SumOfDigits {
    public static void main(String[] args) {
        int sum = 0 ;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter A Num : ");
        int num = in.nextInt();
        while (num != 0) {
            sum = sum + num % 10;
            num = num / 10;
    }
        System.out.println(sum);
    }
}
