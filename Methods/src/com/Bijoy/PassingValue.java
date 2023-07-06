package com.Bijoy;

import java.util.Scanner;

//Q : Addition of two Number by passing the value/arguments to the functions/methods and by returning the value

public class PassingValue {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in); //taking the two number from user
        System.out.print("Enter the value of a : ");
        int a = in.nextInt();
        System.out.print("Enter the value of b : ");
        int b = in.nextInt();
        int Addition = sum1(a,b); //passing the numbers through the sum method and assigning it to variable name 'Addition'
        System.out.println("the Addition value is : "+Addition);

    }
    static int sum1(int a , int b){
        int sum = a + b ;
        return sum ;
    }
}
