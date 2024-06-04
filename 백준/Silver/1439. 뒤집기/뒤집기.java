import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int zero = 0;
        int one = 0;
        char tmp = s.charAt(0);
        
        if(tmp == '0') zero++;
        else one++;

        for (int i = 1; i < s.length(); i++) {
            if(tmp != s.charAt(i)) {
                if (tmp == '0') one++;
                else zero++;
                tmp = s.charAt(i);
            }
        }
        System.out.println(Math.min(zero,one));
    }
}
