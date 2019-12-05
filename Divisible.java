package practice;
import java.util.Scanner;

public class Divisible {
    public static void main(String args[]){

        String s = "Consultadd";
        String s1= "Python Training";
        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        boolean divisibleby3 = (x % 3 == 0);
        boolean divisibleby5 = (x % 5 == 0);

        if(divisibleby3 && divisibleby5){
            System.out.println(s+ " " +s1);
        }
        else if (divisibleby5){
            System.out.println(s1);
        }
        else if(divisibleby3){
            System.out.println(s);
        }
    }
}
