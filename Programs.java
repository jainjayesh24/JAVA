package com.company;

// Java.util module for taking input from keyboard
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	// write your code here
        //Motional Equation
        // v2-u2 = 2as-> express in terms of a
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of final velocity: ");
        int v = sc.nextInt();
        System.out.println("Enter the value of initial velocity: ");
        int u = sc.nextInt();
        System.out.println("Enter the value of distance: ");
        int s = sc.nextInt();
        int a = ((v*v)-(u*u))/2*s;
        System.out.println("The required value of acceleration: ");
        System.out.println(a);



    }
}
