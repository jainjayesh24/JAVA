import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("It's a QUADRATIC CALCULATOR");
        System.out.println("ax1+bx2=m");
        System.out.println("cx1+dx2=n");
        System.out.println("Enter Value of a: ");
        int a = in.nextInt();
        System.out.println("Enter Value of b: ");
        int b = in.nextInt();
        System.out.println("Enter Value of m: ");
        int m = in.nextInt();
        System.out.println("Enter Value of c: ");
        int c = in.nextInt();
        System.out.println("Enter Value of d: ");
        int d = in.nextInt();
        System.out.println("Enter Value of n: ");
        int n = in.nextInt();
        int common = a*d-c*b;
        if (common==0){
            System.out.println("The Value of x1 and x2 can't be found, Please provide true values");
        }else{
            int x1 = ((m*d)-(b*n))/(common);
            int x2 = ((n*a)-(m*c))/(common);
            System.out.println(x1);
            System.out.println(x2);
        }
