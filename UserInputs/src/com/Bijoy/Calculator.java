package com.Bijoy;
//Q: Take in two numbers and an operator (+, -, *, /) and calculate the value.

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        float ans = 0;
        Scanner in = new Scanner (System.in);
        System.out.print("Enter an operator : ");
        char op = in.next().trim().charAt(0);
        if(op== '+' || op=='-' || op=='*' || op=='/' || op=='%'){
            System.out.print("Enter value of num1 & num2 : ");
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            switch(op){
                case '+' :
                    ans = num1 + num2 ;
                    break ;
                case '-' :
                    if(num1>num2)
                    ans = num1 - num2 ;
                    else
                        ans = num2 - num1 ;
                    break ;
                case '*' :
                    ans = num1 * num2 ;
                    break ;
                case '/' :
                    if(num1>num2)
                        ans = (float)num1 / num2 ;
                    else {
                        ans = (float) num2 / num1 ;
                    }
                    break ;
                case '%' :
                    if(num1>num2)
                        ans = (float)num1 % num2 ;
                    else {
                        ans = (float)num2 % num1 ;
                    }
                    break ;
            }
            System.out.println(ans);
        }
        else
        {
            System.out.println("Invalid input :( ");
        }

    }
}
