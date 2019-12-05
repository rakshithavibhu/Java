package practice;

import java.sql.SQLOutput;

public class Case {
    public static void main(String[] args) {
        String str = "heLLo WOrLd";
        StringBuffer sb=new StringBuffer(str);

        for(int i = 0; i < str.length(); i++) {
            if(Character.isLowerCase(str.charAt(i))) {
                sb.setCharAt(i, Character.toUpperCase(str.charAt(i)));
            } else if(Character.isUpperCase(str.charAt(i))) {
                sb.setCharAt(i, Character.toLowerCase(str.charAt(i)));
            }
        }
        System.out.println(sb);
    }
}
