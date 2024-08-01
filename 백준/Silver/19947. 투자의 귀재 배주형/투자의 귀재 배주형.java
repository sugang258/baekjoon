import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer;

        stringTokenizer = new StringTokenizer(br.readLine());

        int pay = Integer.parseInt(stringTokenizer.nextToken());
        int year = Integer.parseInt(stringTokenizer.nextToken());

        long[] dp = new long[year+1];

        dp[0] = pay;

        for(int i=1; i<=year; i++){
            dp[i] = (long)Math.floor(dp[i-1] * 1.05);
            if(i >= 3)
                dp[i] = Math.max((long)Math.floor(dp[i-3] * 1.2), dp[i]);
            if(i >= 5)
                dp[i] = Math.max((long)Math.floor(dp[i-5] * 1.35), dp[i]);
        }

        bw.write(dp[year] + "\n");
        bw.flush();
    }
}