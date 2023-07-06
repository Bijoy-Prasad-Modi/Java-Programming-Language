package com.Bijoy;

// passing the string type data to method and then returning string type
public class Stringtype {
    public static void main(String[] args) {

        String personal = greet("Bijoy Prasad Modi");
        System.out.println(personal);
    }
    static String greet(String name){
        String ch = "Hello "+name ;
        return ch ;
    }
}
