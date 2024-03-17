import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public long Solution(int m, int[] ar, long sum,long max) {

        long start = max;
        long end = sum;
        long min = 0;

        while(end >= start) {
            long mid = (end + start) / 2;
            if(check(ar,mid) <= m) {
                min = mid;
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return min;

    }

    //녹화 길이 가능한지 체크
    static long check(int[] ar, long num) {
        int cnt = 1;
        long sum = 0;
        for (int i = 0; i < ar.length; i++) {
            sum += ar[i];
            if(sum > num) {
                sum = 0;
                i--;
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] ar = new int[n];

        st = new StringTokenizer(br.readLine());
        long sum = 0;
        long max = 0;
        for (int i = 0; i < n; i++) {
            ar[i] = Integer.parseInt(st.nextToken());
            sum += ar[i];
            max = Math.max(max, ar[i]);
            
        }

        System.out.println(T.Solution(m,ar,sum,max));

    }
}
