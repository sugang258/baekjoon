import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node_3187{
    public int x;
    public int y;

    public Node_3187(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {

    static int r,c;
    static char[][] board;
    static boolean[][] check;
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};
    static Queue<Node_3187> queue = new LinkedList<>();
    static int sheep, wolf;

    public void BFS(int x, int y) {
        queue.offer(new Node_3187(x,y));
        int s = 0;
        int w = 0;
        while(!queue.isEmpty()) {
            Node_3187 node = queue.poll();
            if(board[node.x][node.y] == 'v') w++;
            if(board[node.x][node.y] == 'k') s++;
            for (int i = 0; i < 4; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];

                if(nx < 0 || nx >= r || ny < 0 || ny >= c) continue;
                if(board[nx][ny] != '#' && !check[nx][ny]) {
                    check[nx][ny] = true;
                    queue.offer(new Node_3187(nx,ny));
                }
            }
        }
        if (w >= s) wolf += w;
        else sheep += s;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        r = sc.nextInt();
        c = sc.nextInt();

        board = new char[r][c];
        check = new boolean[r][c];

        for (int i = 0; i < r; i++) {
            String tmp = sc.next();
            for (int j = 0; j < c; j++) {
                board[i][j] = tmp.charAt(j);

                if(board[i][j] == '#') check[i][j] = true;
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if(board[i][j] !='#' && !check[i][j]) {
                    check[i][j] = true;
                    T.BFS(i,j);
                }
            }
        }
        System.out.print(sheep + " " + wolf);
    }
}
