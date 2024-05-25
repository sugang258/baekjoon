import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int n,m;
    static char[][] board;
    static boolean[][] check;
    static Queue<Node> queue = new LinkedList<>();

    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};

    static int me,you;

    class Node{
        private int x;
        private int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public void BFS(int x, int y, char c){
        queue.offer(new Node(x,y));
        int count = 1;
        check[x][y] = true;
        while(!queue.isEmpty()) {
            Node node = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];

                if(nx < 0 || nx >= m || ny < 0 || ny >= n) continue;
                if(board[nx][ny] == c && !check[nx][ny]) {
                    check[nx][ny] = true;
                    queue.offer(new Node(nx,ny));
                    count++;
                }
            }
        }
        if (c == 'W') me = me + (count * count);
        else you = you + (count * count);
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        board = new char[m][n];
        check = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            String tmp = sc.next();
            for (int j = 0; j < n; j++) {
                board[i][j] = tmp.charAt(j);
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j] == 'W' && !check[i][j]) {
                    T.BFS(i,j,'W');
                }
                if(board[i][j] == 'B' && !check[i][j]) {
                    T.BFS(i,j,'B');
                }
            }
        }
        System.out.println(me + " " + you);
    }
}
