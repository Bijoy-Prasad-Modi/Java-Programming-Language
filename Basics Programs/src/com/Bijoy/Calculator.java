package com.Bijoy;

import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ans = 0 ;
        //Take input form the user till user doesn't press 'X' or 'x'
        while (true){
            //take operator as input
            System.out.print("Enter an operator : ");
            char op = input.next().trim().charAt(0);  // op -> operator
            if(op== '+' || op=='-' || op=='*' || op=='/' || op=='%'){
                System.out.print("Enter the value of a and b : ");
                int a = input.nextInt();
                int b = input.nextInt();
                if(op=='+'){
                    ans = a + b;
                }
                else if(op=='-'){
                    ans = a - b;
                }
                else if(op=='*'){
                    ans = a * b;
                }
                else if(op=='/'){
                    if(a!=0 || b!=0)
                    { ans = a / b;}
                }
                else if(op=='%'){
                    ans = a % b;
                }
                System.out.println("Your Answer is "+ans);
            }
            else if(op=='x'||op=='X')
                break;
            else  {
                System.out.println("Invalid input!!");
            }
        }
    }
}
