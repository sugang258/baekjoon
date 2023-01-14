import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {	

	static int[][] ar;
	static Integer[] dp;
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int n = sc.nextInt();
		
		
		ar = new int[n][2];
		dp = new Integer[n];
		
		for(int i=0;i<n;i++) {
				ar[i][0] = sc.nextInt();
				ar[i][1] = sc.nextInt();
		}
		
		sort();
		
		for(int i=0;i<n;i++) {
			max = Math.max(dp(i), max);
		}
		
		System.out.println(n-max);
	}
	
	static int dp(int n) {
		
		if(dp[n] == null) {
			dp[n] = 1;
			
			for(int i=n+1;i<dp.length;i++) {
				if(ar[n][1] < ar[i][1]) {
					dp[n] = Math.max(dp[n], dp(i) + 1);
				}
			}
		}
		
		return dp[n];
	}
	
	static void sort() {
		
		Arrays.sort(ar, new Comparator<int[]>() {
			
			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return o1[0] - o2[0];
			}
			
		});
	}

}