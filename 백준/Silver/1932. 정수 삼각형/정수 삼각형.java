import java.io.IOException;
import java.util.Scanner;

public class Main {	
	
	static int[][] ar;
	static Integer[][] dp;
	static int sum;
	
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ar = new int[n][n];
		dp = new Integer[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				ar[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0;i<n;i++) {
			dp[n-1][i] = ar[n-1][i];
		}
		
		System.out.println(dp(0,0));
	}
	
	static int dp(int a, int b) {
		
		if(dp[a][b] == null) {
			dp[a][b] = Math.max(dp(a+1,b), dp(a+1,b+1)) + ar[a][b];
			
		}
		return dp[a][b];
	}
	
	
	
}