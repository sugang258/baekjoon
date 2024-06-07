import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        int n = sc.nextInt();
        int[] ar = new int[n-1];

        if(n == 1) System.out.println(answer);
        else{
            int me = sc.nextInt();
            for (int i = 0; i < n-1; i++) {
                ar[i] = sc.nextInt();
            }
            while(true) {
                Arrays.sort(ar);
                if(ar[n-2] < me) break;
                answer++;
                ar[n-2]--;
                me++;
            }
            System.out.println(answer);
        }
    }
}
