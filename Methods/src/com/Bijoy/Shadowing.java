package com.Bijoy;
//SCoping : when you add another variable in a scope that overlap
public class Shadowing {
    static int x= 60; // This will be shadowed at line 8th
    public static void main(String[] args) {
        System.out.println(x);
        x = 50;  // As initializing A new valirable with the same refference variable , new value gonna overwrite the previous value
        System.out.println(x);
        fun();


       /*
       if you wanna access a value between initialization and declaration it will give an error
       int x ; //decalre the variable
        System.out.println(x); // can't be print as value is not initialized ,
        x = 60; // intializing the variable */

    }

    private static void fun() {
        x = 55; //lower level is shadowing the upper level ,So higher level is shadowed
        System.out.println(x);
    }
}
