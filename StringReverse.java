package practice;

public class StringReverse {
    public static void main(String[] args) {
        String st = "This is a new Java batch";
        String s = st.toUpperCase();
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb = sb.reverse();

        System.out.println(sb);
    }
}
