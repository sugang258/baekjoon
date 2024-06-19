import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            String c = sc.next();
            for (int i = 0; i < n-1; i++) {
                String str = sc.next();
                if(c.charAt(0) >= str.charAt(0)) {
                    c = str + c;
                }
                else c = c + str;
            }
            System.out.println(c);
        }
    }
}
