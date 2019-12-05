package practice;

public class Avgofthree {
    public static void main(String args[]){
        int a = 10;
        int b = 20;
        int c = 30;

        float avg = (a+b+c)/3;
        System.out.println("Average =" +avg);

        if(avg>a && avg>b && avg>c){
            System.out.println("Average is greater than a, b, c");
        }
        else if (avg>a && avg>b){
            System.out.println("Average is greater than a, b");
        }
        else if (avg>a && avg>c){
            System.out.println("Average is greater than a, c");
        }
        else if (avg>b && avg>c){
            System.out.println("Average is greater than b, c");
        }
        else if (avg>a){
            System.out.println("Average is just greater than a");
        }
        else if (avg>b){
            System.out.println("Average is just greater than b");
        }
        else if (avg>c){
            System.out.println("Average is just greater than c");
        }
    }
}
