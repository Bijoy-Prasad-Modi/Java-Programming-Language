package com.Bijoy;
//Q: Perfect Number
//perfect number, a positive integer that is equal to the sum of its proper divisors


import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        int i=1, sum = 0;
        Scanner in = new Scanner (System.in);
        System.out.print("Enter a Num : ");
        int num = in.nextInt();
        while(i<num){
            if(num%i==0)
                sum+=i;
            i++;
        }
        System.out.println(sum);
    }
}
