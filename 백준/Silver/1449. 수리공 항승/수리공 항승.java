import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double l = sc.nextInt();
        double[] ar = new double[n];

        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextDouble();
        }
        Arrays.sort(ar);
        int cnt = 1;

        double left = ar[0] - 0.5;
        double right = left + l;

        for (int i = 0; i < n; i++) {
            if(!(ar[i] >= left && ar[i] <= right)) {
                left = ar[i] - 0.5;
                right = left + l;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
