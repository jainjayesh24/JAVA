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

// Calculate oldest and youngest person
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter First Person Age: ");
        int age1 = SC.nextInt();
        System.out.println("Enter Second Person Age: ");
        int age2 = SC.nextInt();
        System.out.println("Enter Third Person Age: ");
        int age3 = SC.nextInt();
        if (age1 > age2 && age1 > age3) {
            System.out.println("The oldest age is of (First Person) and i.e" + age1);
        } else if (age2 > age1 && age2 > age3) {
            System.out.println("The oldest age is of (Second Person) and i.e" + age2);
        } else {
            System.out.println("The oldest age is of (Third Person) and i.e" + age3);
        }
        if (age1<age2 && age1<age3 ){
            System.out.println("The youngest age is of (First Person) and i.e"+age1);
        }else if(age2<age1 && age2<age3){
            System.out.println("The youngest age is of (Second Person) and i.e"+age2);
        }else{
            System.out.println("The youngest age is of (Third Person) and i.e"+age3);

        }    }
    }


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter Marks of Physics: ");
        int Physics = SC.nextInt();
        System.out.println("Enter Marks of Chemistry: ");
        int Chemistry = SC.nextInt();
        System.out.println("Enter Marks of Mathematics: ");
        int Mathematics = SC.nextInt();
        System.out.println("Enter Marks of Computer Science: ");
        int CS = SC.nextInt();
        System.out.println("Enter Marks of English: ");
        int English = SC.nextInt();

        /*
        Percentage >= 90% : Grade A
    Percentage >= 80% : Grade B
    Percentage >= 70% : Grade C
    Percentage >= 60% : Grade D
    Percentage >= 40% : Grade E
    Percentage < 40% : Grade F
         */

        int Per = (Physics+Chemistry+CS+Mathematics+English)/5;
        if (Per>=90){
            System.out.println("Grade is: A ");
        }else if(Per>=80){
            System.out.println("Grade is: B");
        }else if(Per>=70){
            System.out.println("Grade is: C");
        }else if(Per>=60){
            System.out.println("Grade is: D");
        }else if(Per>=40){
            System.out.println("Grade is: E");
        }else{
            System.out.println("Grade is: F");
        }
           }
    }
