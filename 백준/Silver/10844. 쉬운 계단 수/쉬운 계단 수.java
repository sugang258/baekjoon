import java.io.IOException;
import java.util.Scanner;

public class Main {	
	
	static int[] ar;
	static Long[][] dp;	
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
				
		int n = sc.nextInt();
		
		dp = new Long[n+1][10];
		
		for(int i=0; i<10;i++) {
			dp[1][i] = 1l;
		}
		
		long result = 0;
		
		for(int i=1;i<=9;i++) {
			result += dp(n,i);
		}
		
		System.out.println(result % 1000000000);
		
	}
	
	static long dp(int a, int b) {
		
		if(a == 1) {
			return dp[a][b];
		}
		
		if(dp[a][b] == null) {
			if(b == 0) {
				dp[a][b] = dp(a-1, 1);
			}
			else if(b == 9) {
				dp[a][b] = dp(a-1, 8);
			}
			else {
				dp[a][b] = dp(a-1,b-1) + dp(a-1,b+1);
			}
		}
		
		
		return dp[a][b] % 1000000000;
		
	}
	
	
	
}