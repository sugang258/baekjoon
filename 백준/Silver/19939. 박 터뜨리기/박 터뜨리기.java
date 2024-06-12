import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 1; i < k+1; i++) {
            n -= i;
            if(n < 0) break;
        }
        if(n >= 0) {
            if(n % k > 0) {
                System.out.println(k);
            }
            else System.out.println(k-1);
        }
        else System.out.println(-1);
    }
}
