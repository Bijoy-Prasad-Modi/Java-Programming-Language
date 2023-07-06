package com.Bijoy;
// Scoping means where we can access our variables
// in function you can access the variables inside it
public class Scoping {
    public static void main(String[] args) { //as if you have variable declare in main you can not declare it on other methods
        int a = 10;                         //only we can access 'a' in the main function only
        int b = 20;                        // anything that is declare outside you can use inside but can't declare it inside ,anything that is inside you can not use outside
        {                  //block scoping : values are declare in the block will remain in the block
           // int a = 80 ;//As 'a' is already initialized outside the block in the same method , hence you can't initialized again
           a = 52;       // but you can reassign the original reference variable to some other value or modified it , then use it

            System.out.println(a);
            int c = 7; // anything that is declare inside you can't use outside but anything that is outthing you can use inside
        }
    }
    static void random(){
       // System.out.println(a); //here we can not print 'a' as variable 'a' is not exist in this function
    }

    {//block scoping : values are declare in the block will remain in the block
        int a = 80 ;

    }


}
