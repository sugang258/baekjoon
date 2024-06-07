import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int j = sc.nextInt();

        int cnt = 0;

        int left = 0;
        int right = left + m - 1;
        for (int i = 0; i < j; i++) {
            int a = sc.nextInt() - 1;
            if(a < left) {
                int tmp = left - a;
                cnt += tmp;
                left -= tmp;
                right -= tmp;
            }
            else if(a > right) {
                int tmp = a - right;
                cnt += tmp;
                right += tmp;
                left += tmp;
            }
        }
        System.out.println(cnt);
    }
}
