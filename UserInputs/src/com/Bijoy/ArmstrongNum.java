package com.Bijoy;

import java.util.Scanner;

import static java.lang.Math.pow;

// Q : To find Armstrong Number between two given number.
/* Armstrong number is a number that is equal to the sum of cubes of its digits

    Let's try to understand why 153 is an Armstrong number.

    153 = (1*1*1)+(5*5*5)+(3*3*3)
    where:
    (1*1*1)=1
    (5*5*5)=125
    (3*3*3)=27
    So:
    1+125+27=153
 */
public class ArmstrongNum {
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
        System.out.print("Enter two number : ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        for(int i = num1 ;i<num2 ; i++){
            int temp , rem , sum =0 ;
            temp = i;
            if(temp!=0){
                rem = temp%10;
               sum = (int) (sum + pow(rem,3));
               temp = temp/10 ;
            }
            if (sum==i){
                System.out.println(i+" is a Armstrong number");
            }
        }
    }
}
