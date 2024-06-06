import java.util.Scanner;

public class Main {

    static String A = "AAAA";
    static String B = "BB";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String answer = "";
        
        n = n.replaceAll("XXXX",A);
        answer = n.replaceAll("XX",B);
        
        if(answer.contains("X")) answer = "-1";
        
        System.out.println(answer);
    }
}
