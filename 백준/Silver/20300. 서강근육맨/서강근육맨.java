import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] ar = new long[n];

        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextLong();
        }
        Arrays.sort(ar);

        long answer = 0;
        if(n % 2 == 0) {
            for (int i = 0; i < n/2; i++) {
                answer = Math.max(answer, ar[i] + ar[n-1-i]);
            }
        }else {
            answer = ar[n-1];
            for (int i = 0; i < (n-1)/2; i++) {
                answer = Math.max(answer, ar[i] + ar[n-2-i]);
            }
        }
        System.out.println(answer);
    }
}
