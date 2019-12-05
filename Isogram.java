package practice;

import java.lang.reflect.Array;
import java.util.Arrays;
public class Isogram {
    static boolean is_isogram(String s){
        int l = s.length();
        s= s.toUpperCase();
        char a[] = s.toCharArray();
        Arrays.sort(a);
        for (int i=0; i<l-1; i++){
            if(a[i]==a[i+1])
                return false;
        }
        return true;
    }
    public static void main(String args[]){
        String str = "Java Training";
        System.out.println(is_isogram(str));
        String str1 = "Abcd";
        System.out.println(is_isogram(str1));
    }
}
