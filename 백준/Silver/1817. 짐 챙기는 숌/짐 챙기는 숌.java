import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(n == 0) {
            System.out.println(0);
            return;
        }

        int cnt = 1;
        int weight = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            weight += a;
            if (weight > m) {
                weight = a;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
