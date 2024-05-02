import java.util.Scanner;

public class Main {

    static int r,c,count;
    static int check = 0;
    static int[][] board;
    static int[] dy = {-1,0,1,0};
    static int[] dx = {0,-1,0,1};

    public void DFS(int l, int count,int r1, int c1) {

        if(board[r1][c1] == 1) count++;
        if (l == 3) {
            if(count >= 2) check = 1;
            return;
        }

        for (int i = 0; i < 4; i++) {
            int nx = r1+dx[i];
            int ny = c1+dy[i];
            if(ny < 0 || ny > 4 || nx < 0 || nx > 4 || board[nx][ny] == -1) continue;
            board[r1][c1] = -1;
            DFS(l+1,count,nx,ny);
            board[r1][c1] = 0;

        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        board = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        r = sc.nextInt();
        c = sc.nextInt();
        T.DFS(0,0,r,c);
        System.out.println(check);
    }

    public boolean check(int a, int b) {
        if(board[a][b] != -1) {
            return true;
        }
        return false;
    }
}
