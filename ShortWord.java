package practice;

public class ShortWord {
    public static void main(String args[]) {
        String s = "To find the shortest word";
        String[] words = s.split(" ");
        String shortest = words[0];
        int len = shortest.length();
        for( int i = 1; i<len;i++){
            if(words[i].length() < shortest.length()){
                shortest = words[i];
            }
        }
        System.out.println("Shortest word is "+shortest );
    }
}
