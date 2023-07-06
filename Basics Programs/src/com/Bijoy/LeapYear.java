package com.Bijoy;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter the year : ");
        int year = in.nextInt();
        if(year%4==0){
            System.out.println("It's a leap year");
        }
        else{
            System.out.println("It's not a leap year");
        }
    }
}
