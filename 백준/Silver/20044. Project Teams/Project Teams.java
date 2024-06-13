import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n*2];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        Arrays.sort(ar);

        int start = 0;
        int end = ar.length-1;
        int answer = Integer.MAX_VALUE;

        while(start < end) {
            answer = Math.min(ar[start] + ar[end],answer);
            start++;
            end--;
        }
        System.out.println(answer);
    }
}
