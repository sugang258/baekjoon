import java.util.Scanner;

public class Main {

    public int Solution(int n, int[] ar) {

        int start = 1;
        int end = n;
        int min = Integer.MAX_VALUE;

        while(end >= start) {
            int mid = (end + start) / 2;
            if(check(ar,n,mid) == true) {
                min = Math.min(min,mid);
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return min;

    }

    static boolean check(int[] ar, int n, int num) {
        boolean[] check = new boolean[n];

        for (int i = 0; i < ar.length; i++) {
            int a = ar[i];
            int start = a - num;
            int end = a + num;
            if(a - num < 0) {
                start = 0;
            }
            if(a + num > n) {
                end = n;
            }
            for (int j = start; j < end; j++) {
                check[j] = true;
            }
        }
        for (int i = 0; i < n; i++) {
            if (check[i] == false) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] ar = new int[m];
        for (int i = 0; i < m; i++) {
            ar[i] = sc.nextInt();
        }

        System.out.println(T.Solution(n,ar));
    }
}
