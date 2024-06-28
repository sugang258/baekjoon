import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        int gold = 0;

        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        Arrays.sort(ar);

        for (int i = 0; i < n-1 ; i++) {
            gold += ar[i] + ar[n-1];
        }
        System.out.println(gold);
    }
}
