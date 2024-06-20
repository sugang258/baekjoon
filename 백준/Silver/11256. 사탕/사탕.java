import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int j = sc.nextInt();
            int n = sc.nextInt();
            int[] ar = new int[n];

            int cnt = 1;
            int tmp = 0;

            for (int i = 0; i < n; i++) {
               int r = sc.nextInt();
               int c = sc.nextInt();
               ar[i] = r* c;
            }
            Arrays.sort(ar);

            for (int i = n-1; i >= 0; i--) {
                tmp += ar[i];
                if (tmp >= j) {
                    break;
                }
                cnt++;
            }
            System.out.println(cnt);
        }
    }
}
