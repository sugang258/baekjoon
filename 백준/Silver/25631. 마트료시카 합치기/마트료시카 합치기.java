import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] ar = new Integer[n];
        boolean[] check = new boolean[n];

        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        Arrays.sort(ar);

        int cnt = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if(ar[i] < ar[j] && !check[j]) {
                    check[j] = true;
                    ar[i] = 0;
                    break;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if(ar[i] != 0) cnt++;
        }
        System.out.println(cnt);
    }
}
