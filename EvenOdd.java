package practice;
public class EvenOdd {
    static void odd(int a []){
        for(int i=0;i<=a.length-1; i++){
            int val=a[i] % 2;
            if(val== 0){
                System.out.println(a[i]);
            }
        }
    }

    static void even(int b[]){
        for(int i=0;i<=b.length-1; i++){
            int val=b[i] % 2;
            if(val== 1){
                System.out.println(b[i]);
            }
        }
    }

    public static void main(String[] args) {
    int a[]= {23,25,75,87,47,1,91,51,2};
    int b[]= {22,44,64,76,98,12,43,54,90};

    odd(a);
    even(b);
    }
}
