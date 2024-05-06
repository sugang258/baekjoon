import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    static int n,m,t;
    static int[][] board;
    static boolean[][] check;
    static int count;

    static int[] dx = {0,-1,0,1};
    static int[] dy = {-1,0,1,0};


    public boolean DFS(int x, int y) {

        if (x < 0 || x >= n || y < 0 || y >= m) return false;
        if (check[x][y]) return false;

        check[x][y] = true;
        if(board[x][y] >= t) {
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                DFS(nx,ny);
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        board = new int[n][m];
        check = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                int r = Integer.parseInt(st.nextToken());
                int g = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                board[i][j] = (int)Math.floor((r+g+b) / 3);
            }
        }
        st = new StringTokenizer(br.readLine());
        t = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(T.DFS(i,j)) count++;
            }
        }
        System.out.println(count);
    }
}
