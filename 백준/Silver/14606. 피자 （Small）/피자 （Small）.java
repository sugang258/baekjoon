import java.util.Scanner;

public class Main {
    static int[] dp;
    public static int Solution(int n) {
        for (int i = 2; i <= n; i++) {
            dp[i] = (i-1) + dp[i-1];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        dp = new int[n+1];
        dp[1] = 0;

        System.out.println(Solution(n));
    }
}
