import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            int[] ar = new int[n];

            long answer = 0;
            for (int i = 0; i < n; i++) {
                ar[i] = sc.nextInt();
            }
            int start = ar[n-1];
            for (int i = n-2; i >= 0; i--) {
                if(ar[i] <= start) answer += start - ar[i];
                else start = ar[i];
            }
            System.out.println(answer);
        }
    }
}
