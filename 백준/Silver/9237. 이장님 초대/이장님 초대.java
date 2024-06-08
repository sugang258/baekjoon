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
        int answer = 1;
        int fin = 1;
        for (int i = n-1; i >= 0; i--) {
            fin = Math.max(answer+ar[i], fin);
            answer++;
        }
        System.out.println(fin+1);
    }
}
