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



// CGPA Calculator
package com.company;

// Java.util module for taking input from keyboard
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	// write your code here
        System.out.println("CGPA Maker");
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter marks of first: ");
        int marks1 = SC.nextInt();
        System.out.println("Enter marks of Second: ");
        int marks2 = SC.nextInt();
        System.out.println("Enter marks of third: ");
        int marks3 = SC.nextInt();
        int CGPA = (marks1+marks2+marks3)/30;
        System.out.println("The required CGPA is:  "+CGPA);


	int x = SC.nextInt();
	int y = SC.nextInt();
	int new = (x-y)/2;
	    

    }
}

//Important Points
// Pascal case Naming convention for classes: -->>> AddTwoNumbers
// Camel case Naming convention for functions:-->>> addTwoNumbers
// Whitespaces are not allowed in classes and FUNCTIONS(Identifiers)
// sout is the keyword used for opertor printing in java
// Packages--->Classes--->Functions
// Declaration of variable
// data_type variable_name = Value it stores
// int number = 8
//Variable declaration -->> Keyword(Not possible)
//Cannot start with digit, white space is not allowed
// contain alphabets, _ , $
// taking input from java


