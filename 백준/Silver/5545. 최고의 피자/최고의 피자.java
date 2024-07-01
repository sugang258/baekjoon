import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        Integer[] ar = new Integer[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        Arrays.sort(ar,Collections.reverseOrder());

        int total = c;
        int cal = c/a;

        for (int i = 0; i < n; i++) {
            total += ar[i];
            int price = a + (b * (i+1));
            if(total / price < cal) break;
            cal = total / price;
        }
        System.out.println(cal);
    }
}
