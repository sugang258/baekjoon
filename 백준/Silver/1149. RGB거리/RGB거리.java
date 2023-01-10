import java.io.IOException;
import java.util.Scanner;

public class Main {	
	
	static int[][] ar;
	static int[][] dp;	
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ar = new int[n][3];
		dp = new int[n][3];
		
		for(int i=0;i<n;i++) {
			ar[i][0] = sc.nextInt();
			ar[i][1] = sc.nextInt();
			ar[i][2] = sc.nextInt();
		}
		
		dp[0][0] = ar[0][0];
		dp[0][1] = ar[0][1];
		dp[0][2] = ar[0][2];
		
		System.out.println(Math.min(dp(n-1,2), Math.min(dp(n-1,0), dp(n-1,1))));
	}
	
	static int dp(int n, int color) {
		
		if(dp[n][color] == 0) {
			if(color == 0) {
				dp[n][0] = Math.min(dp(n-1,1), dp(n-1,2)) + ar[n][0];
			}
			else if(color == 1) {
				dp[n][1] = Math.min(dp(n-1,0),dp(n-1,2)) + ar[n][1];
			}
			else {
				dp[n][2] = Math.min(dp(n-1,0), dp(n-1,1)) + ar[n][2];
			}
		}
		return dp[n][color];
	}	
}