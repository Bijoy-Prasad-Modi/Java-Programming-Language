package com.Bijoy;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        int i = 1 , hcf = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of num1 & num2 : ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        while (i <= num1) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
            i++;
        }
        System.out.println("The HCF value is : " + hcf);
    }
}
