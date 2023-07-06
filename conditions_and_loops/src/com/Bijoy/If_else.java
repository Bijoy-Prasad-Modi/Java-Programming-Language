package com.Bijoy;

import java.util.Scanner;

public class If_else {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter the salary : ");
        int salary = input.nextInt() ;
        if (salary>20000){
            salary = salary + 2000;
        }
        else{
            salary = salary + 1000 ;
        }
        System.out.println("Your salary is "+ salary);
    }
}
