import java.util.Scanner;

public class Main {

    static int[] ar;
    static int[] dy;

    public static void Solution(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dy[i] = Math.max(dy[i],dy[i-j]+ar[j]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ar = new int[n+1];
        dy = new int[n+1];
        for (int i = 1; i <= n; i++) {
            ar[i] = sc.nextInt();
        }
        Solution(n);
        System.out.println(dy[n]);
    }
}
