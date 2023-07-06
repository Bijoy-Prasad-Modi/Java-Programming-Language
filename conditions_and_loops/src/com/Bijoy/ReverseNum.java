package com.Bijoy;

public class ReverseNum {
    public static void main(String[] args) {
        int num = 84661;
        int result = 0;
        while(num>0){
            int rem = num % 10;
            num = num/10;
            result = (result * 10) + rem ;}
        System.out.println(result);
    }
}
