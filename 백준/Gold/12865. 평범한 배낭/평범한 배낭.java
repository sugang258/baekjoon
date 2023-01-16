import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {	

	static int[] W;
	static int[] V;
		
	static int[][] dp;
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		int max = 0;
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		W = new int[N];
		V = new int[N];
		dp = new int[N][K+1];
		
		for(int i=0; i<N; i++) {
			W[i] = sc.nextInt();
			V[i] = sc.nextInt();
		}
		
		System.out.println(dp(N-1,K));
		
		
		
	}
	
	static int dp(int i, int K) {
		
		if(i < 0) {
			return 0;
		}
		
		if(dp[i][K] == 0) {
			if(W[i] > K) {
				dp[i][K] = dp(i-1,K);
			}
			
			else if(W[i] <= K) {
				dp[i][K] = Math.max(dp(i-1,K), dp(i-1,K-W[i]) + V[i]);
			}
		}
		
		return dp[i][K];
	}

}