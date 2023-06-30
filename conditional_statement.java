package com.company;

// Java.util module for taking input from keyboard
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a = SC.nextInt();
        System.out.println("Enter Second Number: ");
        int b = SC.nextInt();
        if (a==b){
            System.out.println("a is equal to b");
        }else if (a>b){
            System.out.println("a is greater than b");
        }else{
            System.out.println("a is lesser than b");
        }


    }
}


// To find greatest of three number
Scanner SC = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a = SC.nextInt();
        System.out.println("Enter Second Number: " );
        int b = SC.nextInt();
        System.out.println("Enter Third Number: ");
        int c = SC.nextInt();

        if (a>b){
            if (a>c){
                System.out.println("The Greatest Number is: "+a);
            }
        }else if(b>a){
            if (b>c){
                System.out.println("The Greatest Number is: "+b);
            }
        }else{
            System.out.println("The Greatest Number is: "+c);
        }
