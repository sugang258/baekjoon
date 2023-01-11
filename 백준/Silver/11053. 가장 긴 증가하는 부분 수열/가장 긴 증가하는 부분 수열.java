import java.io.IOException;
import java.util.Scanner;

public class Main {	
	
	static int[] ar;
	static int[] dp;
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
				
		int n = sc.nextInt();
		
		ar = new int[n];
		dp = new int[n];
		
		for(int i=0;i<n;i++) {
			ar[i] = sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			dp(i);
		}
		
		int max = dp[0];
		
		for(int i=1;i<n;i++) {
			max = Math.max(max, dp[i]);
		}
		
		System.out.println(max);
		
	}
	
	static int dp(int n) {
		
		if(dp[n] == 0) {
			dp[n] = 1;
			
			for(int i=n-1; i>=0; i--) {
				if(ar[i] < ar[n]) {
					dp[n] = Math.max(dp[n], dp(i)+1);
				}
			}
		}
		
		return dp[n];
	}
	
	
	
}