package com.Bijoy;

import java.util.Scanner;

// Q : Input a number and print all the factors of that number
public class FactorsOfNum {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter a Number : ");
        int num = in.nextInt();
        System.out.println("the factors of num "+num+" are :");
        for(int i =1 ;i<=num ; i++){
            if(num%i==0){
                System.out.println(i+" ");
            }
        }
    }
}
