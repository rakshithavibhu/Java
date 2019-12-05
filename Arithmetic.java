package practice;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String args[]){

        System.out.println("Enter two numbers");
        Scanner scan = new Scanner(System.in);
        int first = scan.nextInt();
        int second = scan.nextInt();
        System.out.println("Select the options");
        System.out.println("1 - Addition \n 2 - Subtraction \n 3 - Division \n 4 - Multiplication \n 5 - Average \n");
        int option = scan.nextInt();
        int result = 0;
        switch(option){
            case 1: result = first + second;
                    System.out.println("Addition of " +first+ " and " +second+ " is " +result);
                    if(result<0){
                        System.out.println("Oops option 1 is returning negative number");
                    }
                    break;
            case 2: result = first - second;
                    System.out.println("Subtraction of " +first+ " and " +second+ " is " +result);
                    if(result<0){
                        System.out.println("Oops option 2 is returning negative number");
                    }
                    break;
            case 3: result = first / second;
                    System.out.println("Division of " +first+ " and " +second+ " is " +result);
                    if(result<0){
                        System.out.println("Oops option 3 is returning negative number");
                    }
                    break;
            case 4: result = first * second;
                    System.out.println("Multiplication of " +first+ " and " +second+ " is " +result);
                    if(result<0){
                        System.out.println("Oops option 4 is returning negative number");
                    }
                    break;
            case 5: System.out.println("Enter two numbers to calculate the average");
                    Scanner sc= new Scanner(System.in);
                    int first1 = sc.nextInt();
                    int second2 = sc.nextInt();
                    int res = first1 + second2;
                    int avg = res/2;
                    System.out.println("Average of " +first1+ " and " +second2+ " is " +avg);
                    if(avg<0){
                        System.out.println("Oops option 5 is returning negative number");
                    }
                    break;
            default: System.out.println("Invalid");
                    break;
        }

    }
}
