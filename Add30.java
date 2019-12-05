package practice;

import java.util.Scanner;

public class Add30 {
    public static void main(String args[]) {
        System.out.println("Enter two values between 1-10");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = x + y;
        int result = z + 30;
        System.out.println("Addition of " +x+ " , "+y+ " and 30 is  "+result);
    }
}
