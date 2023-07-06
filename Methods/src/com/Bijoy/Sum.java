package com.Bijoy;


import java.util.Scanner;

//Q : print the the value of two number using Method/Function



public class Sum {
    public static void main(String[] args) {


        /* Scanner in = new Scanner(System.in);
        System.out.print("Input num1 : ");
        int num1 = in.nextInt();
        System.out.print("Input num2 : ");
        int num2 = in.nextInt();
        int sum = num1 + num2 ;
        System.out.println("num is "+ sum);*/



        //calling method with no return value ,So it will only do  print/Display  and will not return anything
       // method1();

        //calling method which will return value ,So the method will return a value instead of Displaying anything

        int ans = method2();
        System.out.println("the Sum is : "+ans);
    }

   //Void method will return any value ,only do display
    /*static void method1(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input num1 : ");
        int num1 = in.nextInt();
        System.out.print("Input num2 : ");
        int num2 = in.nextInt();
        int sum = num1 + num2 ;
        System.out.println("num is "+ sum);
    }*/

    //int method can return value
    static int method2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input num1 : ");
        int num1 = in.nextInt();
        System.out.print("Input num2 : ");
        int num2 = in.nextInt();
        int sum = num1 + num2 ;
        return sum; // after return statement no step will execcute  & with return statement you have to return something otherwise the code will give an error
    }
}
