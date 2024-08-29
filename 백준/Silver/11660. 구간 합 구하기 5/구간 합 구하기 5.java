import java.util.Scanner;

public class Main {
    static int[][] ar;

    public static int Solution(int x1, int y1, int x2, int y2) {
        int sum = 0;

        for (int i = x1; i <= x2; i++) {
            sum = sum + (ar[i][y2] - ar[i][y1-1]);

        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        ar = new int[n+1][n+1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                ar[i][j] = ar[i][j-1] + sc.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            System.out.println(Solution(x1,y1,x2,y2));
        }
    }
}
