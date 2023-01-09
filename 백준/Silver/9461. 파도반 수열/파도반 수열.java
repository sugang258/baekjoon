import java.io.IOException;
import java.util.Scanner;

public class Main {	
	
	static long dp[];
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		dp = new long[101];

		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			System.out.println(fibo(a));
			
		}
	}
	
	static long fibo(int n) {
		
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 1;
		dp[3] = 1;
				
		if(dp[n] == 0) {
			dp[n] = (fibo(n-3) + fibo(n-2));
		}
		return dp[n];
	}
}