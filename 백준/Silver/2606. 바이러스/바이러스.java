import java.util.Scanner;

public class Main {
    static int n, m, cnt;
    static int[][] graph;
    static int[] ch;


    public void DFS(int v) {
        ch[v] = 1;
        cnt++;

        for (int i = 1; i <= n; i++) {
            if(graph[v][i] == 1 && ch[i] == 0) {
                DFS(i);
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        graph = new int[n+1][n+1];
        ch = new int[n+1];

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            graph[a][b] = 1;
            graph[b][a] = 1;
        }
        T.DFS(1);
        System.out.println(cnt-1);
    }
}
