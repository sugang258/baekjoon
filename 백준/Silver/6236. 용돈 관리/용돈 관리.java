import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public int Solution(int m, int[]ar) {

        int start = Arrays.stream(ar).max().getAsInt();
        int end = Arrays.stream(ar).sum();
        int min = 0;

        while(end >= start) {
            int mid = (end+start) / 2;
            if(check(ar,mid) <= m) {
                min = mid;
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return min;
    }

    //m -> 몇번인지 확인하는 메서드
    static int check(int[] ar, int num) {
        int bank = num;
        int cnt = 1;
        for (int i = 0; i < ar.length; i++) {
            bank -= ar[i];
            if(bank < 0) {
                ++cnt;
                bank = num - ar[i];
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }

        System.out.println(T.Solution(m,ar));
    }
}
