package com.Bijoy;
//Q : Take integer inputs till the user enters 0 and print the sum of all numbers
//(HINT: while loop)
import java.util.Scanner;

public class SumOfAllNum {
    public static void main(String[] args) {
        int sum = 0;
        while(true){
            Scanner in = new Scanner (System.in);
            System.out.println("Enter a num");
            int num = in.nextInt();
            if(num==0)
                break;
            else{
                 sum = sum + num ;
            }
            System.out.println(sum);
        }
    }
}
