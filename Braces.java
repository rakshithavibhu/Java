package practice;

import java.util.Scanner;
import java.util.Stack;

public class Braces {

    public static boolean isbalanced(String s){
        Stack <Character> st = new Stack<Character>();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
                st.push(s.charAt(i));
            }
            //if(s.charAt(i)==')' || s.charAt(i)==']' || s.charAt(i)=='}'){
            if (s.isEmpty())
            {
                return false;
            }
            /*if(s.charAt(i)==')'){ //&& s.peek() =='(' || s.charAt(i)==']' && s.peek() =='[' || s.charAt(i)=='}' && s.peek() =='{'){
                return true;
                //s.pop(s.charAt(i));
            }*/

        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Enter the braces");
        Scanner sc = new Scanner(System.in);
        String c = sc.nextLine();


    }
}
