import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        while(true) {
            int answer = 0;
            int l = sc.nextInt();
            int p = sc.nextInt();
            int v = sc.nextInt();

            if(l == 0 && p == 0 && v == 0) break;

            answer = (v / p) * l + Math.min(l, v%p);
            System.out.println("Case " + n + ": " + answer);
            n++;
        }
    }
}
