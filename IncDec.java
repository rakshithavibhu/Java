package practice;
import java.util.Scanner;

public class IncDec {
    public static void main(String args[]) {
        System.out.println("Enter 3 numbers");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if(a>b && b>c){
            System.out.println("Decreasing");
        }
        else if (a<b && b<c){
            System.out.println("Increasing");
        }
        else {
            System.out.println("Neither increasing nor decreasing");
        }
    }
}
