import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        int answer = 0;

        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        int start = ar[0];

        for (int i = 1; i < n; i++) {
            if(ar[i] < start) start = ar[i];
            if(ar[i] > start) {
                answer = Math.max(answer, ar[i] - start);
            }
        }
        System.out.println(answer);
    }
}
