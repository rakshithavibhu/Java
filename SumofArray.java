package practice;

import java.util.Scanner;

public class SumofArray {

    static void sum (int arr[], int n ){
        int large = arr[0];
        int small = arr[0];
        int sum = 0;
        System.out.println("----");
        for (int i=0; i<n;i++ ){
            if (arr[i]> large){
                large = arr[i];
            }
            if (arr[i]< small){
                small = arr[i];
            }
        }
        //System.out.println(large);
        //System.out.println(small);

        for(int j=0; j<n; j++ ){
            sum = sum + arr[j];
        }
        sum = sum - small - large;
        System.out.println("Sum excluding the largest and smallest element is "+sum);

    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int i;
        System.out.println("Enter the number of elements in the array");
        int n = s.nextInt();

        int[] a = new int[n];
        System.out.println("Enter the elements of the array");
        for (i=0; i<n; i++){
            a[i]=s.nextInt();
        }

        /*for(int j=0; j<n; j++) {
            System.out.println(a[j]);
        }*/
        sum(a, n);
    }

}
