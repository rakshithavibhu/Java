package practice;

import java.util.Scanner;

public class p7 {
    public static void main(String args[]) {

        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if(n==0){
            System.out.println("Zero");
            System.out.println("Small");
        }
        else if (n < 0){
            System.out.println("Negative");
            System.out.println("Small");
        }
        else if (n > 0) {
            System.out.println("Positive");
            if (n > 1000000) {
                System.out.println("Big");
            }
        }
    }
}
