import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
    private int x;
    private int y;

    public Node(int x, int y) {
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

    static int n,m,day = 0;
    static int[][] board,dis;
    static boolean[][] check;
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};
    static Queue<Node> queue = new LinkedList<>();

    public void BFS() {
        while(!queue.isEmpty()) {
            Node node = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = node.getX() + dx[i];
                int ny = node.getY() + dy[i];

                if(nx < 0 || nx >= m || ny < 0 || ny >= n) continue;
                if (board[nx][ny] == 0 && !check[nx][ny]) {
                    check[nx][ny] = true;
                    queue.offer(new Node(nx,ny));
                    dis[nx][ny] = dis[node.getX()][node.getY()] + 1;

                    day = Math.max(dis[nx][ny], day);
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        board = new int[m][n];
        dis = new int[m][n];
        check = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();

                //토마토가 없는 자리는 방문한 것으로 처리
                if (board[i][j] == -1) check[i][j] = true;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j] == 1 && !check[i][j]) {
                    queue.offer(new Node(i,j));
                    dis[i][j] = 0;
                    check[i][j] = true;
                }
            }
        }
        T.BFS();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0 && !check[i][j]) day = -1;
            }
        }

        System.out.println(day);
    }
}
