package com.Bijoy;
/* Write a program to print the sum of negative numbers, sum of positive
even numbers and the sum of positive odd numbers from a list of numbers
(N) entered by the user. The list terminates when the user enters a zero.
 */

import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        int nSum = 0, eSum = 0 , oSum = 0;
        Scanner in = new Scanner (System.in);
        System.out.print("Enter a Num : ");
        while(true){
            int N = in.nextInt();
            if (N==0){
                break;
            }
            else if (N<0) {
                nSum+=N ;
                System.out.println("Sum of negative number is : "+nSum);
            }
            else if (N%2==0) {
                eSum += N ;
                System.out.println("Sum of even number is : "+eSum);
            }
            else {
                oSum+=N;
                System.out.println("Sum of odd number is : "+oSum);
            }
        }
    }
}
