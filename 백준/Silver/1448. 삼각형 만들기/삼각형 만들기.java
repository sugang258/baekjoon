import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] ar = new int[n];

        while(n-->0) {
            ar[n] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(ar);

        int answer = -1;

        for (int i = ar.length-3; i >= 0; i--) {
            if(ar[i+2] < ar[i]+ar[i+1]) {
                System.out.println(ar[i]+ar[i+1]+ar[i+2]);
                return;
            }
        }
        System.out.println(answer);
    }
}
