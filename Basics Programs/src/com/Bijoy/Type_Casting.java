package com.Bijoy;

import java.util.Scanner;

public class Type_Casting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
//        int num = (int)(94.37f); //compressing the bigger number into smaller type explicitly
//        System.out.println(num);

        int a = 258 ;
        byte b = (byte)(a); // 258 % 256= 2
        System.out.println(b);

        // byte c = 50;
        // c = c * 2 ; //this will not work as 2 is int , you cannot assign int to byte

        System.out.println("こんにちは");
        System.out.println(4*3.7);
    }
}
