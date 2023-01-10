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
		
		for(int i=1;i<=n;i++) {
			ar[i] = sc.nextInt();
		}
		
		dp[0] = ar[0];
		dp[1] = ar[1];
		
		if(n >= 2) {
			dp[2] = ar[1] + ar[2];
		}
		
		System.out.println(dp(n));
	}
	
	static int dp(int a) {
		
		if(dp[a] == null) {
			dp[a] = Math.max(dp(a-3)+ar[a-1], dp(a-2)) + ar[a];
		}
		return dp[a];
	}
	
	
	
}