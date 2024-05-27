import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int n,m;
    static int[][] board;
    static int answer = Integer.MIN_VALUE;

    static int[] dx = {0,0,1,-1,1,1,-1,-1};
    static int[] dy = {1,-1,0,0,-1,1,-1,1};
    static class Node {


        private int x;
        private int y;
        private int d;
        public Node(int x, int y, int d) {
            this.x = x;
            this.y = y;
            this.d = d;
        }

    }
    public int BFS(int x, int y) {
        Queue<Node> queue = new LinkedList<>();
        boolean[][] check = new boolean[n][m];

        queue.offer(new Node(x,y,0));
        check[x][y] = true;

        while(!queue.isEmpty()) {
            Node node = queue.poll();
            for (int i = 0; i < 8; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];
                int nd = node.d;
                if(nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if(check[nx][ny]) continue;
                if(board[nx][ny] == 1) return nd+1;
                check[nx][ny] = true;
                queue.offer(new Node(nx,ny,nd+1));
            }
        }
        return 0;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        board = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        int tmp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 1) continue;
                tmp = T.BFS(i,j);
                answer = Math.max(tmp, answer);
            }
        }
        System.out.println(answer);
    }
}
