import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long lcnt = 0;
        long rcnt = 0;
        long sum = 0;
        int idx = 0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a % 2 == 0) {
                sum += idx++;
                lcnt += i;
                rcnt += n - 1 - i;
            }
        }
        System.out.println(Math.min(lcnt, rcnt) - sum);
    }
}
