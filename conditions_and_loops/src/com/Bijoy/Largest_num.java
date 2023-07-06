package com.Bijoy;

import java.util.Scanner;

public class Largest_num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the values : ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
         int max = a;
         if(b>max){
             max= b;
         }
         if(c>max){
             max = c;
         }
        System.out.println("largest number is "+ max);
    }

}
