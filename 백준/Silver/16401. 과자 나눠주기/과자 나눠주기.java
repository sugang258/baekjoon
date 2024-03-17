import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public int Solution(int m, int[] ar, int max) {

        int start = 1;
        int end = max;
        int answer = 0;

        while(end >= start) {
            int mid = (end + start) / 2;
            if(check(mid,ar) >= m) {
                answer = Math.max(answer, mid);
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return answer;
    }

    //나눠줄 수 있는 조카의 수
    static int check(int num, int[] ar) {
        int cnt = 0;
        for (int i = 0; i < ar.length; i++) {
            cnt += ar[i] / num;
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] ar = new int[n+1];
        st = new StringTokenizer(br.readLine());
        int max = 0;
        for (int i = 0; i < n; i++) {
            ar[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max,ar[i]);
        }
        System.out.println(T.Solution(m,ar,max));
    }
}
