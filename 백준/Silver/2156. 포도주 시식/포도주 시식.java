import java.io.IOException;
import java.util.Scanner;

public class Main {	

	static int[] ar;
	static Integer[] dp;
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		ar = new int[n+1];
		dp = new Integer[n+1];

		for(int i=1;i<n+1;i++) {
			ar[i] = sc.nextInt();
		}
				
		dp[0] = 0;
		dp[1] = ar[1];
		
		if(n>1) {
			dp[2] = ar[1]+ar[2];
		}
		
		System.out.println(dp(n));
		
	}
	
	static int dp(int n) {
		
		if(dp[n] == null) {
			dp[n] = Math.max(dp(n-1),Math.max(dp(n-2), dp(n-3) + ar[n-1]) + ar[n]);
		}
		
		return dp[n];
	}
}