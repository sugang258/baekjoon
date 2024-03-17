import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public int Solution(int n, int m, int[] a, int[] b) {

        int count = 0;
        for (int i = 0; i < m; i++) {
            int start = 0;
            int end = n-1;
            int min = Integer.MAX_VALUE;

            while (end >= start) {
                int mid = (end + start) / 2;
                if (b[i] < a[mid]) {
                    min = Math.min(min, mid);
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

            if (min < n) {
                count += (n - min);
            }

        }
        return count;

    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] a = new int[n];
            int[] b = new int[m];

            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            for (int j = 0; j < m; j++) {
                b[j] = sc.nextInt();
            }
            Arrays.sort(a);

            System.out.println(T.Solution(n,m,a,b));
        }
    }
}
