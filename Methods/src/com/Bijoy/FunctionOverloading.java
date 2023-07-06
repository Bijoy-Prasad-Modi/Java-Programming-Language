package com.Bijoy;

//Function loading happened when two or more function of the same name, they can exist if the parameters are different
//Function overloading applicable : Either number of arg shd be different or type of arg shd be different


public class FunctionOverloading {
    public static void main(String[] args) {
     //fun(4); //When we are calling the function with int data type , it will call this :"fun(int a)" function, as it has int data type
       // fun("Bijoy Prasad Modi"); // when you call the function with a string , it will call "fun(String name)" function

        demo(6,8);  //it's gonna call the demo function with two int arguments
        demo(8,7,2);  //it's gonna call the demo function with three int arguments
    }
   static void  fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }


    static void demo (int a , int b){
        int sum = a + b;
        System.out.println(sum);
    }

    static void demo (int a , int b, int c){
        int sum = a + b + c;
        System.out.println(sum);
    }
}
