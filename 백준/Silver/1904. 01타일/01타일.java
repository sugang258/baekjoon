import java.io.IOException;
import java.util.Scanner;

public class Main {	
	
	static int dp[];
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		dp = new int[1000001];
		
		System.out.println(fibo(n));
	}
	
	static int fibo(int n) {
		
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;
		
		if(dp[n] == 0) {
			dp[n] = (fibo(n-2) + fibo(n-1)) % 15746;
		}
		return dp[n];
	}
	
	
}