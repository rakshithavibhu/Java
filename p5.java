package practice;

public class p5 {
    public static void main(String args[]) {
        int n= 6;
        System.out.println("Numbers are:");
        for(int i=0; i<n; i++){
            if(i == 3 && i == 6){
                continue;
            }
            else{
                System.out.print(i);
            }
        }
    }
}
