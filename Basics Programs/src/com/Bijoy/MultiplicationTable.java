package com.Bijoy;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number which multiplication table you want : ");
        int num = in.nextInt();
        for(int i = 1; i <= 10 ; i++){
            System.out.println(num +"x" +i+ "=" +num*i);
        }
    }
}

//public class MultiplicationTable {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the Number which multiplication table you want : ");
//        int num = in.nextInt();
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(num + "X" + num + "=" + num * num);
//        }
//    }
//}