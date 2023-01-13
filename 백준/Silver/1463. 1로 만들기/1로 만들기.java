import java.io.IOException;
import java.util.Scanner;

public class Main {	

	static Integer[] dp;
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
				
		int n = sc.nextInt();
		dp = new Integer[n+1];
		dp[0] = 0;
		dp[1] = 0;
		
		System.out.println(dp(n));
		
	}
	
	static int dp(int n) {
		
		if(dp[n] == null) {
			if(n % 6 == 0) {
				dp[n] = Math.min(dp(n -1),Math.min(dp(n /3), dp(n/2))) + 1;
				
			}else if(n % 3 == 0) {
				
				dp[n] = Math.min(dp(n/3), dp(n-1)) + 1;
				
			}else if(n % 2 == 0) {
				dp[n] = Math.min(dp(n/2), dp(n-1)) + 1;
				
			}else {
				dp[n] = dp(n-1)+1;
				
			}
		}
		return dp[n];
	}
	
	
	
}