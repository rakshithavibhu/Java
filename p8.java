package practice;

import java.util.Scanner;

public class p8 {
    public static void main(String args[]) {

        System.out.println("Enter a character");
        Scanner scan = new Scanner(System.in);
        String ch = scan.nextLine();

        String c = ch.toLowerCase();
        if(c == "r") {
            System.out.println("FOUND");
        } else
            System.out.println("NOT FOUND");
    }
}

//c == "r"|| c == "a" || c == "n" || c == "d" || c == "o" || c == "m"