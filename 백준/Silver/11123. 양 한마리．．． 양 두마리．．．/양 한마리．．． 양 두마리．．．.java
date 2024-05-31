import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node_11123 {
    private int x;
    private int y;

    public Node_11123(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
public class Main {

    static int T;
    static int h,w;
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};
    static char[][] board;
    static boolean[][] check;
    static Queue<Node_11123> queue;

    public void BFS(int x, int y) {
        queue.offer(new Node_11123(x,y));
        while(!queue.isEmpty()) {
            Node_11123 node = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = node.getX() + dx[i];
                int ny = node.getY() + dy[i];

                if (nx < 0 || nx >= h || ny < 0 || ny >= w) continue;
                if (board[nx][ny] == '#' && !check[nx][ny]) {
                    queue.offer(new Node_11123(nx,ny));
                    check[nx][ny] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main M = new Main();
        Scanner sc = new Scanner(System.in);

        T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int count = 0;

            h = sc.nextInt();
            w = sc.nextInt();

            board = new char[h][w];
            check = new boolean[h][w];
            queue = new LinkedList<>();


            for (int j = 0; j < h; j++) {
                String tmp = sc.next();
                for (int k = 0; k < w; k++) {
                    board[j][k] = tmp.charAt(k);
                    if(board[j][k] == '.') check[j][k] = true;
                }
            }

            for (int j = 0; j < h; j++) {
                for (int k = 0; k < w; k++) {
                    if(board[j][k] == '#' && !check[j][k]) {
                        check[j][k] = true;
                        count++;
                        M.BFS(j,k);
                    }
                }
            }
            System.out.println(count);
        }
    }
}
