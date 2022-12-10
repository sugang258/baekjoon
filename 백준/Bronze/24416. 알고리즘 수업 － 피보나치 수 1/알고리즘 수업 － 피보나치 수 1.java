import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
	static int cnt = 0;
	public static void main(String[] agrs) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int n = Integer.parseInt(reader.readLine());
			
			fib_recursion(n);
			writer.append(String.valueOf(cnt) + " ");
			cnt=0;
			fib_dp(n);
			writer.append(String.valueOf(cnt));
			
			writer.flush();
			writer.close();
		} catch (Exception e) {
			
		}
	}
	
	public static int fib_recursion(int n) {
		if(n == 1 || n == 2) {
			cnt++;
			return 1;
		} else {
			return fib_recursion(n-1) + fib_recursion(n-2);
		}
		
	}
	
	public static int fib_dp(int n) {
		int[] dp = new int[n+1];
		
		dp[1] = 1;
		dp[2] = 1;
		
		for(int i=3; i<=n; i++) {
			cnt++;
			dp[i] = dp[i-1] + dp[i-2];
		}
		
		return dp[n];
	}
}