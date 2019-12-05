package practice;
import java.util.Scanner;

public class SumAvg {
    public static void main(String args[]) {
        System.out.println("Enter 10 numbers");
        int sum = 0;
        int avg = 0;
            for (int i=1; i<=10; i++){
                Scanner scan = new Scanner(System.in);
                int n = scan.nextInt();
                sum = sum + n;
            }
        avg = sum /10;
        System.out.println(" Sum is " +sum);
        System.out.println(" Average is " +avg);
        }
    }
