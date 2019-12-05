package practice;

import java.util.Scanner;

public class swap {
    public static void main(String args[]){

        System.out.println("Enter two numbers");
        Scanner scan =new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println("Before swapping a="+a+ " b= "+b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping a="+a+ " b= "+b);

    }

}
