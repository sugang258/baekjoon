import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();
        int[] ar = new int[n];
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }

        dp[0] = 0;
        int min = ar[0];
        sb.append("0");

        for (int i = 1; i < n; i++) {
            if(min > ar[i]) {
                min = ar[i];
                dp[i] = dp[i-1];
            }
            else dp[i] = Math.max(dp[i-1], ar[i] - min);
            sb.append(" " + dp[i]);
        }
        System.out.println(sb);
    }
}
