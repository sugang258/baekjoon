import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];

        int total = 0;

        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
            total += ar[i];
        }
        Arrays.sort(ar);
        long ans = 0;

        for (int i = 0; i < n; i++) {
            long temp = ar[i];
            total -= temp;
            ans += temp * total;
        }
        System.out.println(ans);
    }
}
