import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ar[] = new int[n];

        while(n-- > 0) {
            int p = sc.nextInt();
            int l = sc.nextInt();
            int[] arr = new int[p];
            for (int i = 0; i < p; i++) {
                arr[i] = sc.nextInt();
            }
            if(p<l)  {
                ar[n] = 1;
                continue;
            }
            Arrays.sort(arr);
            ar[n] = arr[p-l];
        }
        Arrays.sort(ar);
        int tmp = 0;
        int cnt = 0;
        for (int i = 0; i < ar.length; i++) {
            tmp += ar[i];
            if(tmp > m) {
                continue;
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}
