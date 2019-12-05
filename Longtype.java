package practice;
import java.util.Scanner;
public class Longtype {
    public static void main(String args[]) {
        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        int count = 0;
        int sum =0;
        while(n!=0){
            sum += n% 10;
            n /= 10;
            count ++;
        }
        System.out.println("No of digits is " +count);
        System.out.println("Sum of all the digits is "+sum);
    }
}
