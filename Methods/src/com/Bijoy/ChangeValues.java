package com.Bijoy;

// change value of an Array by swapping it using method/function
// it's called by value not call by reference in java we do not have pointers
import java.util.Arrays;

public class ChangeValues {
    public static void main(String[] args) {
        int arr [] ={5,9,7,3,6};
        change(arr); // when an object_reference(arr) pass to the parameter, actuallay the reference it self call by value , because the value is being passed reffers to the object
        System.out.println(Arrays.toString(arr)); // syntax for printing the array after modifing the 0th/any index value
    }
    static void change(int nums[]){ //passing the values in Array , nums will be the value of the reference variable pointing to the object
        nums[0]= 66; //then assign new value to 0th index of the array or overwrite it
    }
}
