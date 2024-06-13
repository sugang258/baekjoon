import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] ar = new int[m];

        int max = 0;
        int price = 0;

        for (int i = 0; i < m; i++) {
            ar[i] = sc.nextInt();
        }
        Arrays.sort(ar);
        
        int start = 0;
        if(n < m) {
            start = m-n;
        }
        
        for (int i = start; i < m; i++) {
            if(ar[i] * (m-i) > max) {
                price = ar[i];
                max = ar[i] * (m-i);
            }
        }
        System.out.println(price + " " + max);
    }
}
