package practice;

public class ArraySum {
    public static void main(String args[]){
        int[] a = {10, 20, 30, 40, 50, -10};
        int sum = 0;
        for(int i=0; i<a.length; i++ )
        {
            if(a[i]>0){
                sum = sum + a[i];
                //System.out.println(a[i]);
                //System.out.println(sum);
                //System.out.println("__");
            }
        }
        System.out.println("Sum of the elements in the array is:"+sum);
    }
}
