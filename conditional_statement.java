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

// NO days in month
public class Main {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter Month(Number): ");
        int a = SC.nextInt();
        System.out.println("Enter Year: ");
        int b = SC.nextInt();

        //int intArray31[] = {1,3,5,7,8,10,12};
        //int intArray30[] = {4,6,9,11};
        if (a==2 && b%4==0){
            System.out.println("29 Days");
        }
        else if(a==2 && b!=0){
            System.out.println("28 Days");
        }
        else if(a==1 || a==3 || a==5 || a==7 || a==8 || a==10 || a==12){
            System.out.println("31 days");
        }else{
            System.out.println("30 days");
        }


    }
}


