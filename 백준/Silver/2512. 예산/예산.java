import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public int Solution(int n, int m, int[] ar) {

        int start = 0;
        int end = ar[n-1];
        int max = Integer.MIN_VALUE;
        while(end >= start) {
            int mid = (start+end) / 2;
            int sum = val(ar,mid);
            if(sum > m) {
                end = mid - 1;
            }else{
                start = mid + 1;
                max = Math.max(max,mid);
            }
        }
        return max;
    }

    int val(int[] ar, int mid) {
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            if(ar[i] >= mid) {
                sum += mid;
            }else {
                sum+= ar[i];
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        int m = sc.nextInt();

        Arrays.sort(ar);

        System.out.println(T.Solution(n,m,ar));

    }
}
