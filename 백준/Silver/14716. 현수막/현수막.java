import java.util.Scanner;

public class Main {

    static int m,n;
    static int[][] board;
    static boolean[][] check;
    static int count = 0;

    static int[] dx = {1,-1,0,0,1,1,-1,-1};
    static int[] dy = {0,0,1,-1,1,-1,1,-1};

    public void DFS(int x, int y) {
        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx < 0 || nx >= m || ny < 0 || ny >= n) continue;
            if(board[nx][ny] == 1 && !check[nx][ny]) {
                check[nx][ny] = true;
                DFS(nx,ny);
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        m = sc.nextInt();
        n = sc.nextInt();
        board = new int[m][n];
        check = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
                if(board[i][j] == 0) check[i][j] = true;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j] == 1 && !check[i][j]) {
                    count = count + 1;
                    check[i][j] = true;
                    T.DFS(i,j);
                }
            }
        }
        System.out.println(count);
    }
}

