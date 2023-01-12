import java.io.IOException;
import java.util.Scanner;

public class Main {	
	
	static int[] ar;
	static int[] r_dp;
	static int[] l_dp;
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
				
		int n = sc.nextInt();
		
		ar = new int[n];
		r_dp = new int[n];
		l_dp = new int[n];
		
		for(int i=0;i<n;i++) {
			ar[i] = sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			r_dp(i);
			l_dp(i);
		}
		
		int max = -1000;
	
		
		for(int i=0;i<n;i++) {
			max = Math.max(max, r_dp[i]+ l_dp[i]);
		}
		
		System.out.println(max - 1);
		
	}
	
	static int r_dp(int n) {
		
		if(r_dp[n] == 0) {
			r_dp[n] = 1;
			
			for(int i=n-1; i>=0; i--) {
				if(ar[i] < ar[n]) {
					r_dp[n] = Math.max(r_dp[n], r_dp(i)+1);
				}
			}
		}
		
		return r_dp[n];
	}
	
	static int l_dp(int n) {
		if(l_dp[n] == 0) {
			l_dp[n] = 1;
			
			for(int i=n+1;i<l_dp.length;i++) {
				if(ar[i]< ar[n]) {
					l_dp[n] = Math.max(l_dp[n], l_dp(i)+1);
				}
			}
		}
		return l_dp[n];
	}
}