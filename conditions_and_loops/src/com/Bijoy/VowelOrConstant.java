package com.Bijoy;

import java.util.Scanner;

//Q: Java Program Vowel Or Consonant
public class VowelOrConstant {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter an character : ");
        char c = in.next().trim().charAt(0);
        if (c=='a' ||c=='e' ||c=='i'||c=='o'||c=='u'){
            System.out.println("vowel");
        }
        else{
            System.out.println("consonant");
        }
    }
}
