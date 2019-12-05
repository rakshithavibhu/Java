package practice;

import java.util.Scanner;

public class p4 {
    public static void main(String args[]){
        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        while (n>0){
            System.out.println("Good Going");
            continue;
        }

        while(n<0){
            System.out.println("It's over");
            break;
        }
    }
}
