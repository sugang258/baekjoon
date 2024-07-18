import java.util.Scanner;

public class Main {
    static int[][] dp;
    public static void Solution(int k) {
        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;

        for (int i = 2; i <= k; i++) {
            dp[i][0] = dp[i-1][1];
            dp[i][1] = dp[i-1][0] + dp[i-1][1];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        dp = new int[46][2];

        Solution(k);
        System.out.println(dp[k][0] + " " + dp[k][1]);
    }
}
