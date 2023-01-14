import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {	

	static char[] ar;
	static char[] ar2;
	static Integer[][] dp;
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		int max = 0;
		
		ar = sc.nextLine().toCharArray();
		ar2 = sc.nextLine().toCharArray();
		
		dp = new Integer[ar.length][ar2.length];
		
		System.out.println(dp(ar.length-1, ar2.length-1));
	
		
	}
	
	static int dp(int x, int y) {
		
		if(x == -1 || y == -1) {
			return 0;
		}
		
		if(dp[x][y] == null) {
			dp[x][y] = 0;
			
			if(ar[x] == ar2[y]) {
				dp[x][y] = dp(x-1,y-1) + 1;
			}else {
				dp[x][y] = Math.max(dp(x-1,y), dp(x,y-1));
			}
			
		}		
		return dp[x][y];
	}
	
	
	
	
	
}