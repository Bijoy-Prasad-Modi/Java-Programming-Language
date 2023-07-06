package com.Bijoy;

import java.util.Scanner;
//Q: Displaying dates or Displaying if it's weekand or weekdays using switch cases
public class DisplayDay {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in); //taking input from user
        System.out.print("Enter any day between 1 to 7 : ");
        int day = input.nextInt();
        /*switch (day) {
            case 1 -> System.out.println("It's a Monday");
            case 2 -> System.out.println("It's a Tuesday");
            case 3 -> System.out.println("It's a Wednesday");
            case 4 -> System.out.println("It's a Thursday");
            case 5 -> System.out.println("It's a Friday");
            case 6 -> System.out.println("It's a Saturday");
            case 7 -> System.out.println("It's a Sunday");}*/

        /*switch (day) {
            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
            System.out.println("it's weekdays");
            break ;
            case 6:
            case 7 :
            System.out.println("it's weekend");
            break;
        }*/


        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("it's weekdays");
            case 6, 7 -> System.out.println("it's weekend");
        }
    }
}
