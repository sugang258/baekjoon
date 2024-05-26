import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node_21736{
    private int x;
    private int y;

    public Node_21736(int x, int y) {
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

    static int n,m;
    static char[][] board;
    static boolean[][] check;
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};

    static Queue<Node_21736> queue = new LinkedList<>();

    static int answer = 0;

    public void BFS(int x, int y) {
        queue.offer(new Node_21736(x,y));
        while(!queue.isEmpty()) {
            Node_21736 node = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = node.getX() + dx[i];
                int ny = node.getY() + dy[i];

                if(nx < 0 || nx >= n || ny < 0 || ny >= m )continue;
                if(board[nx][ny] != 'X' && !check[nx][ny]) {
                    check[nx][ny] = true;
                    queue.offer(new Node_21736(nx,ny));
                    if(board[nx][ny] == 'P') answer++;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        board = new char[n][m];
        check = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String tmp = sc.next();
            for (int j = 0; j < m; j++) {
                board[i][j] = tmp.charAt(j);
                if(board[i][j] == 'X') check[i][j] = true;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 'I') T.BFS(i,j);
            }
        }
        if (answer == 0) System.out.println("TT");
        else System.out.println(answer);
    }
}
