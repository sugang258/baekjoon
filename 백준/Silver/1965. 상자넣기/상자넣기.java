import java.util.Scanner;

public class Main {
    static int[] ar;
    static int[] dy;
    public static int Solution(int n) {

        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if(ar[i] > ar[j]) {
                    dy[i] = Math.max(dy[i], dy[j] + 1);
                }
            }
            max = Math.max(max, dy[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ar = new int[n];
        dy = new int[n];

        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
            dy[i] = 1;
        }
        System.out.println(Solution(n));
    }
}
