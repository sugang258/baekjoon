import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public void Solution(int n, int m, int[] note1, int[] note2) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            sb.append(check(n,note1,note2[i])).append("\n");
        }
        System.out.println(String.valueOf(sb).trim());
    }

    int check(int n, int[] note1, int num ) {
        int start = 0;
        int end = n-1;
        while(end >= start) {
            int mid = (end+start) / 2;
            if( note1[mid] == num) {
                return 1;
            }
            if(num < note1[mid]) end = mid-1;
            else start = mid+1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] note1 = new int[n];

            for (int j = 0; j < n; j++) {
                note1[j] = sc.nextInt();
            }
            int m = sc.nextInt();
            int[] note2 = new int[m];
            for (int j = 0; j < m; j++) {
                note2[j] = sc.nextInt();
            }

            Arrays.sort(note1);

            T.Solution(n,m,note1,note2);
        }
    }
}
