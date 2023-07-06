package com.Bijoy;

import java.util.Scanner;

// two value passed and Swap using methods

public class Swap {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter the value of a : ");
        int a = in.nextInt(); // reference variable a will be pointing to the user input
        System.out.print("Enter the value of b : ");
        int b = in.nextInt(); // reference variable b will be pointing to the user input

        // simple code for swapping the two values
//        int tem = a;
//        a = b;
//        b = tem;
       // System.out.println("now a is : "+a+" and b is : "+b);

        swap(a,b);
    }
    static void swap(int c , int d){ //Now c & d will be pointing towards the user input
        int tem = c; //value of c assigning to tem
        c = d;       // value of d assigning to c
        d = tem;     // value of temp, which was value of c is now assigning to d
        System.out.println("now a is : "+c+" and b is : "+d);  //that's how the value get swapped
    }
}
