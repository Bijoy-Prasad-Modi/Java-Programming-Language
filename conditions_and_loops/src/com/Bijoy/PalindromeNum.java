package com.Bijoy;

import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter a Num : ");
        int num = in.nextInt();
        int temp = num;
        int rev = 0;
        while(temp!=0){
            int rem = temp%10;
            rev = rev * 10 +rem ;
            temp = temp/10;
if(temp == rev){
    System.out.println("it's palindrome num");
}
        }
    }
}
