import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static int r,c;
    static char[][] board;
    static boolean[][] check;
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};
    static Queue<Node> queue = new LinkedList<>();

    static int sheep = 0, wolf = 0;

    class Node{
        private int x;
        private int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public void BFS(int x, int y) {
        queue.offer(new Node(x,y));
        int s1 = 0;
        int w1= 0;
        while(!queue.isEmpty()) {
            Node node = queue.poll();
            if(board[node.x][node.y] == 'o') s1++;
            if(board[node.x][node.y] == 'v') w1++;
            for (int i = 0; i < 4; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];

                if(nx < 0 || nx >= r || ny < 0 || ny >= c) continue;
                if(!(board[nx][ny] == '#') && !check[nx][ny]) {
                    check[nx][ny] = true;
                    queue.offer(new Node(nx, ny));
                }
            }
        }
        if(s1 > w1) sheep = sheep + s1;
        else wolf = wolf + w1;
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
                if(!(board[i][j] == '#') && !check[i][j]) {
                    check[i][j] = true;
                    T.BFS(i,j);
                }
            }
        }
        System.out.print(sheep + " " + wolf);
    }
}
