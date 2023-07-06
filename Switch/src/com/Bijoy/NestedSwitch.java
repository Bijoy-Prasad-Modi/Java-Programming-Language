package com.Bijoy;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter your choice: ");
        int emp = input.nextInt();
//Normal switch statement
        /*switch(emp){
            case 1:
                System.out.println("Bijoy prasad Modi");
                break;
            case 2:
                System.out.println("Himesh Bhattacharjee");
                break;
            case 3:
                System.out.println("Employee Number 3");
                switch(department){
                    case "IT":
                        System.out.println("Tushar from It department");
                        break;
                    case "CSE":
                        System.out.println("Manash from CSE department");
                        break;
                    case "ECE":
                        System.out.println("Priyanka from ECE department");
                        break;
                    default :
                        System.out.println("Enter a valid input");
                }
                break;
            default:
                System.out.println("Enter a valid inpiut");

        }*/
        //Enhanced switch statement or a better way to write a code
        switch (emp) {
            case 1 -> System.out.println("Employee Priyanka Bal");
            case 2 -> System.out.println("Employee Himesh Bhattacharjee");
            case 3 -> {
                System.out.print("Enter the department : ");
                String department = input.next();
                System.out.println("Employee Number 3");
                switch (department) {
                    case "IT" -> System.out.println("Tushar Das from It department");
                    case "CSE" -> System.out.println("Manash Roy from CSE department");
                    case "ECE" -> System.out.println("Debolina Saha from ECE department");
                    default -> System.out.println("Enter a valid input");
                }
            }
            default -> System.out.println("Enter a valid inpiut");
        }
    }
}
