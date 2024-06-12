import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] ar = new Integer[n];

        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        Arrays.sort(ar, Collections.reverseOrder());

        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 3 == 2) continue;
            sum += ar[i];
        }
        System.out.println(sum);
    }
}
