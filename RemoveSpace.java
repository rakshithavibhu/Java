package practice;

public class RemoveSpace {

    static String space(String s){
        s =s.replaceAll("\\s","");
        return s;
    }
    public static void main(String args[]){
        String str = "Ja v a   Tr a in i n    g";
        String st = space(str);
        System.out.println(st);
    }
}
