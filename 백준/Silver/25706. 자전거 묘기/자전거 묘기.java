import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        int[] dp = new int[n];
        for (int i = n - 1; i >= 0; i--)
            dp[i] = i + arr[i] + 1 < n ? dp[i + arr[i] + 1] + 1 : 1;

        StringBuilder sb = new StringBuilder();
        for (int i : dp)
            sb.append(i).append(" ");

        bw.write(sb.toString());
        bw.flush();
    }

}