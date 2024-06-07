import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();

        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }

        Arrays.sort(ar);
        for (int i = 0; i < n; i++) {
            if(l >= ar[i]) {
                l++;
            }
            else continue;
        }
        System.out.println(l);
    }
}
