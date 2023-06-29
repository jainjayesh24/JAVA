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



package com.company;

// Java.util module for taking input from keyboard
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	// write your code here
        //Write a Program to increment value of number by 1 if the number is 1 and decrease by 1 if number is odd
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = sc.nextInt();
        if (a%2==0) {
            a++;
            System.out.println("The number is even and the final value is: ");
            System.out.println(a);
        }
        else
            --a;
            System.out.println("The number is odd and the final value is: ");
            System.out.println(a);
        System.out.println(6*5-34/2);
        System.out.println((6*5-34)/2);
        System.out.println(6*(5-34/2));
    }
}



