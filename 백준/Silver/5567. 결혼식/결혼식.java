import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static int n, m, answer;
    static int[][] graph;
    static int[] ch;
    static int[] dist;

    public void BFS(int v) {
        LinkedList<Integer> queue = new LinkedList<>();

        ch[v] = 1;
        queue.offer(v);
        dist[v] = 0;
        while(queue.size() != 0) {
            int cur = queue.poll();
            if(dist[cur] < 2) {
                int[] next = graph[cur];
                for (int i = 0; i < next.length; i++) {
                    if (next[i] == 1 && ch[i] == 0) {
                        ch[i] = 1;
                        dist[i] = dist[cur] + 1;
                        answer++;
                        queue.offer(i);
                    }
                }
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
        dist = new int[n+1];

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = graph[b][a] = 1;
        }

        ch[1] = 1;
        T.BFS(1);
        System.out.println(answer);
    }
}
