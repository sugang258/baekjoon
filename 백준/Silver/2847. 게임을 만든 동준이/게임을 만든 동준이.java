import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];

        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }

        int cnt = 0;
        for (int i = n-2; i >= 0 ; i--) {
            if(ar[i] >= ar[i+1]) {
                cnt += (ar[i] - ar[i+1]) + 1;
                ar[i] = ar[i+1] - 1;
            }
        }
        System.out.println(cnt);
    }
}
