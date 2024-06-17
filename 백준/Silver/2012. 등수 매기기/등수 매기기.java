import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n+1];

        ar[0] = 0;
        for (int i = 1; i <= n; i++) {
            ar[i] = sc.nextInt();
        }

        Arrays.sort(ar);

        long answer = 0;
        for (int i = 1; i <= n; i++) {
            answer += Math.abs(i-ar[i]);
        }
        System.out.println(answer);
    }
}
