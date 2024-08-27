import java.util.Scanner;

public class Main {
    static double[] ar;

    public static String Solution(int n) {
        double max = ar[0];

        for (int i = 1; i < n; i++) {
            ar[i] = Math.max(ar[i], ar[i-1]*ar[i]);
            max = Math.max(max, ar[i]);
        }
        return String.format("%.3f",max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ar = new double[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextDouble();
        }
        System.out.println(Solution(n));
    }
}
