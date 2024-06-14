import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int cnt = 0;

            int w_b = 0;
            int b_w = 0;

            String start = sc.next();
            String end = sc.next();

            for (int j = 0; j < n; j++) {
                if (start.charAt(j) != end.charAt(j)) {
                    if(start.charAt(j) == 'W') w_b++;
                    else b_w++;
                }
            }
            //서로 바꿀 말이 있을때
            if(w_b > 0 && b_w > 0) {
                if(w_b > b_w) cnt = b_w + (w_b - b_w);
                else cnt = w_b + (b_w - w_b);
            }
            else {
                cnt = w_b + b_w;
            }
            System.out.println(cnt);
        }
    }
}
