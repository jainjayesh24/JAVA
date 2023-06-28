package com.company;

// Java.util module for taking input from keyboard
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	// write your code here
        System.out.println("Greeting Program: ");
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = SC.next();
        System.out.println("Hello "+ name + ",have a good day");
        //Check input number is integer or not
        System.out.println(SC.hasNextInt());

    }
}
