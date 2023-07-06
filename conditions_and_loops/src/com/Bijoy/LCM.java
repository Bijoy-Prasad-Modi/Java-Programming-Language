package com.Bijoy;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        int i = 2;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of num1 & num2 : ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        while(num1!=num2){
            int temp = num1 * i;
            if(temp%num2==0){
                System.out.println("The LCM value is : "+temp);
                break;
            }
            i++;
        }
    }
}
