package com.Bijoy;

import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
//        String word = "hello" ;
       System.out.print("please enter an input : ");
        char ch = input.next().trim().charAt(0);
       if(ch >= 'a' && ch<= 'z'){
           System.out.println("Lower case");}
           else{
               System.out.println("Upper case");
           }

    }
}
