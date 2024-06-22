import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        int b_cnt = 0;
        int r_cnt = 0;
        char tmp = ' ';

        for (int i = 0; i < n; i++) {
            char cur = str.charAt(i);
            if(cur != tmp) {
                if(cur == 'B') b_cnt++;
                else r_cnt++;
            }
            tmp = cur;
        }
        int answer = Math.min(b_cnt,r_cnt);
        System.out.println(answer+1);
    }
}
