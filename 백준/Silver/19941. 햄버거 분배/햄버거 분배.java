import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        String str = sc.next();
        boolean[] check = new boolean[n];

        int cnt = 0;

        //p일때, 앞에서 부터 탐색 - H이고 check[i] == false => 햄버거 먹을 수 있음
        for (int i = 0; i < n; i++) {
            if(str.charAt(i) == 'P') {
                int start = i - k;
                int end = i + k;

                if(start < 0) start = 0;
                if(end > n-1) end = n-1;

                for (int j = start; j <= end; j++) {
                    if(str.charAt(j) == 'H' && check[j] == false){
                        cnt++;
                        check[j] = true;
                        break;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
