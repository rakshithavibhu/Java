package practice;
import java.util.Scanner;

public class Months {
    public static void main(String args[]) {
        System.out.println("Enter the number of the month");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        switch(n){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                    System.out.println("The month has 31 days");
                    break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("The month has 30 days");
                break;
            case 2 : System.out.println("The month has 28/29 days");
                    break;
            default : System.out.println("Invalid details");

        }
    }
}

