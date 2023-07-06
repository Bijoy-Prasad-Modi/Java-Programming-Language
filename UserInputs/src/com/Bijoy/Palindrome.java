package com.Bijoy;
/* Q : To find out whether the given String is Palindrome or not.

A string is said to be a palindrome if it is the same if we start reading it from left to right or right to left */


import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter a string value : ");
        String str = in.nextLine();
        if (palindrome(str))
            // It is a palindrome
            System.out.print("It is a palindrome ");
        else
            // Not a palindrome
            System.out.print("It is not a palindrome");
    }


    static boolean palindrome(String str){
        int i = 0;
        int j = str.length()-1 ;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                return false ;}
            i++ ;
            j-- ;
        }
        return true ;
    }
}
