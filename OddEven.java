package practice;
import java.util.Scanner;

public class OddEven {
    public static void main(String args[]) {
        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if(n % 2 == 0){
            if(n >= 2 && n <= 5){
                System.out.println("OLD");
            }
            if(n >= 6 && n <= 30){
                System.out.println("NEW");
            }
            if(n>30){
                System.out.println("OLD");
            }
        }
        else{
            System.out.println("NEW");
        }
    }
}
