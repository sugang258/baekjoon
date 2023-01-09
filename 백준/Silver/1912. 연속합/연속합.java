import java.io.IOException;
import java.util.Scanner;

public class Main {	
	
	static Integer dp[];
	static int num[];
	static int max;
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		dp = new Integer[n];
		num = new int[n];
		
		for(int i=0;i<n;i++) {
			num[i] = sc.nextInt();
		}
		
		dp[0] = num[0];
		max = num[0];
		
		dp(n-1);
		
		System.out.println(max);
		
	}
	
	static int dp(int a) {
		
		if(dp[a] == null) {
			dp[a] = Math.max(dp(a-1) + num[a], num[a]);
			
			max = Math.max(dp[a], max);
		}
		return dp[a];
	}
}