import java.util.Scanner;

public class Main {

    static int n,m;
    static int[][] board;
    static boolean[][] check;
    static String answer = "NO";

    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};

    public void DFS(int x, int y) {
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || nx >= m || ny < 0 || ny >= n) continue;
            if (board[nx][ny] == 0 && !check[nx][ny]) {
                if (nx == (m - 1)) answer = "YES";
                check[nx][ny] = true;
                DFS(nx, ny);
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        m  = sc.nextInt();
        n = sc.nextInt();

        board = new int[m][n];
        check = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            String tmp = sc.next();
            for (int j = 0; j < n; j++) {
                board[i][j] = Integer.parseInt(String.valueOf(tmp.charAt(j)));
                if(board[i][j] == 1) check[i][j] = true;
            }
        }

        for (int j = 0; j < n; j++) {
            if(board[0][j] == 0 && !check[0][j]) {
                check[0][j] = true;
                T.DFS(0,j);
            }
        }
        System.out.println(answer);
    }
}
