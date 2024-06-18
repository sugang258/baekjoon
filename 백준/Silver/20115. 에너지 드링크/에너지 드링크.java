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

        double answer = ar[n-1];

        for (int i = 0; i < n-1; i++) {
            if(ar[i] % 2 != 0) {
                answer += (ar[i]/2) + 0.5;
            }else answer += ar[i]/2;
        }
        System.out.println(answer);
    }
}
