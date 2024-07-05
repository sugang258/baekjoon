import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Integer[] ar = new Integer[n];

        int minus = (k-1) * k / 2;
        int answer = 0;

        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        Arrays.sort(ar, Collections.reverseOrder());

        for (int i = 0; i < k; i++) {
            answer += ar[i];
        }
        System.out.println(answer - minus);
    }
}
