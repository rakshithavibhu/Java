package practice;

public class Prg5 {
    public static void main(String[] args) {
        int val =3;
        for(int i=0; i<=6;i++) {
            if (i != 3 && i != 6) {
                System.out.print(i+" ");
            } else {
                continue;
            }
        }
    }
}

