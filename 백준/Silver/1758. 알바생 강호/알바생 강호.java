import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];

        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        Arrays.sort(ar);

        int num = 1;
        long tip = 0;
        for (int i = n-1; i >= 0 ; i--) {
            int tmp = ar[i] - (num - 1);
            if(tmp >= 0) {
                tip += tmp;
            }
            num++;
        }
        System.out.println(tip);
    }
}
