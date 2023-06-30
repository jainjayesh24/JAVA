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
