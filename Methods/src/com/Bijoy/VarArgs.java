package com.Bijoy;
// Variable length Arguments
// when you create a method that takes variable number of arguments , it's basically known as Varargs method
// funtion/method overloading in VarArgs
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(6,8,9,71,6,5,3,6); // Here you can took any number of arguments
                          // when we are providing integer
        fun("bijoy","himesh","Tushar");

        //fun();if we don't pass anything in the arguments ,it will not gonna call either of both function
       // In that case it will show error known As "Ambiguity" ,As the funtion will not known which one to run
    }
    static void fun (int ...v){ //if you want to pass some integers but don't know how many you want to pass do just ...v or any name you want to give

        System.out.println(Arrays.toString(v));
    }
    static void fun (String ...v){ //if you want to pass some integers but don't know how many you want to pass do just ...v or any name you want to give
        System.out.println(Arrays.toString(v));
}}
