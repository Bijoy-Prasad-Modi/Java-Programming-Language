package com.Bijoy;
//Q: Take integer inputs till the user enters 0 and print the largest number from all
import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        while(true){
            System.out.print("Enter the value of num1 & num2 : ");
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            if(num1==0 || num2== 0)
            break;
            else if(num1>num2){
                System.out.println("The largest num is :"+num1);
            }
            else{
                System.out.println("The largest num is :"+num2);
            }


        }
    }
}
