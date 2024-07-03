import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int zero = 0;
        int one = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '0') zero++;
            else one++;
        }
        String answer = "";
        int zero_h = zero / 2;
        int one_h = one / 2;
        for (int i = 0; i < zero_h ; i++) {
            answer += "0";

        }
        for (int i = 0; i < one_h; i++) {
            answer += "1";
        }
        System.out.println(answer);
    }
}
