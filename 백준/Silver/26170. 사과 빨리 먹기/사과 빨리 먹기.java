import java.util.Scanner;

public class Main {

    static int r, c;
    static int[][] board = new int[5][5];
    static boolean[][] check = new boolean[5][5];

    static int result = Integer.MAX_VALUE;

    static int[] dx = {0,-1,0,1};
    static int[] dy = {-1,0,1,0};

    public void DFS(int l, int count, int r1, int c1) {

        if(count > 3) return;
        if(board[r1][c1] == 1) count++;

        if (count == 3) {
            result = Math.min(result, l);
            return;
        }

        check[r1][c1] = true;
        //이동
        for (int i = 0; i < 4; i++) {
            int nx = r1 + dx[i];
            int ny = c1 + dy[i];

            if (nx < 0 || nx > 4 || ny < 0 || ny > 4 || check[nx][ny] || board[nx][ny] == -1) continue;
            DFS(l + 1, count, nx, ny);
        }
        check[r1][c1] = false;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        r = sc.nextInt();
        c = sc.nextInt();

        T.DFS(0,0,r,c);

        if (result == Integer.MAX_VALUE) {
            System.out.println(-1);
        }
        else{
            System.out.println(result);
        }
    }
}
