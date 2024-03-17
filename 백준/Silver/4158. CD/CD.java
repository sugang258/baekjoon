import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public int Solution(int n, int m ,int[] ar1, int[] ar2) {

        int cnt = 0;
        int i = 0;
        int j = 0;
        while(i != n && j != m) {
            if(ar1[i] == ar2[j]) {
                cnt++;
                i++; j++;
            }
            else if(ar1[i] > ar2[j]) j++;
            else i++;
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        Main  T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            if(n == 0 && m ==0) {
                break;
            }

            int[] ar1 = new int[n];
            int[] ar2 = new int[m];

            for (int i = 0; i < n; i++) {
                ar1[i] = Integer.parseInt(br.readLine());
            }
            for (int i = 0; i < m; i++) {
                ar2[i] = Integer.parseInt(br.readLine());
            }
            System.out.println(T.Solution(n,m,ar1,ar2));
        }
    }
}
