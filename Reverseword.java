package practice;

public class Reverseword {
    static String rev(String s){
        String st[] =s.split(" ");
        int len = st.length;
        String s1 = "";
        for(int i= len-1; i>=0; i--){
            s1 =s1 + st[i];
        }
        return s1;
    }

    public static void main(String args[]) {
        String str = "Java Training";
        String s = rev(str);
        System.out.println(s);
    }
    }
