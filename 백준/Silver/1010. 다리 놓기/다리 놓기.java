import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class Main{
	
	static int[][] dp;
	
    public static void main(String[] args) throws NumberFormatException, IOException {
    	Scanner sc = new Scanner(System.in);
    	
    	int a = sc.nextInt();
    	for(int i=0;i<a;i++) {
    		int m = sc.nextInt();
        	int n = sc.nextInt();
        	dp = new int[n+1][m+1];
        	System.out.println(BC(n,m));
    	}
    	
        	
    	
    }
    
    public static int BC(int n, int m) {
    	if(dp[n][m] > 0) {
    		return dp[n][m];
    	}
    	
    	if(n == m || m==0 ) {
    		return dp[n][m] = 1;
    	}
    	return dp[n][m] = (BC(n-1,m-1) + BC(n-1,m));
    	
    }
}

