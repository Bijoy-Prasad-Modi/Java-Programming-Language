package com.Bijoy;
//Finding the LCM and HCF of two number given by user
import java.util.Scanner;

public class LCMandHCF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of num1 & num2 : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        LCM(num1, num2); //LCM : the number which can be divisible by both num1 & num2
        HCF(num1, num2); //HCF : the highest number by which num1 & num2 can be divide


    }
    static void LCM (int num1 , int num2) {
        int i = 2, temp = 1;
        while (num1!=0 && num2!=0) {
            temp=num1*i;
            if (temp % num2 == 0) {
                System.out.println("the LCM value is :" + temp);
                break;
            }

            i++;
        }
    }
    static void HCF(int num1 , int num2){


//        int g =0;                                      // Using for loop
//        for (int i = 1 ; i<=num1 ; i++){
//            if(num1%i==0 && num2%i==0){
//                g = i;
//            }
//        }
//        System.out.println("the HCF value is :"+g);



        int i =1 , hcf=0;                              // Using while Loop
        while(i<=num1){
            if(num1%i==0 && num2%i == 0){
                hcf = i;
            }
            i++;
        }
        System.out.println("the HCF value is : "+hcf);
     }


}

