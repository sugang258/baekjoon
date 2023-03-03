import java.io.*;
import java.util.*;
public class Main {
  static boolean[][] graph;
  static List<Integer> list;
  static int count;
  static int m;
  static int n;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    m = Integer.parseInt(st.nextToken());
    n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());
    list = new ArrayList<>();
    count = 0;
    graph = new boolean[m][n];
    for (int i = 0; i < k; i++) {
      st = new StringTokenizer(br.readLine());
      int n1 = Integer.parseInt(st.nextToken());
      int m1 = Integer.parseInt(st.nextToken());
      int n2 = Integer.parseInt(st.nextToken())-1;
      int m2 = Integer.parseInt(st.nextToken())-1;
      for (int j = m1; j <= m2; j++) {
        for (int l = n1; l <= n2; l++) {
          graph[j][l] = true;
        }
      }
    }
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (!graph[i][j]) {
          count = 1;
          graph[i][j] = true;
          dfs(i,j);
          list.add(count);
        }
      }
    }
    StringBuilder sb = new StringBuilder();
    Collections.sort(list);
    sb.append(list.size() + "\n");
    for (int i = 0; i < list.size(); i++) {
      sb.append(list.get(i) + " ");
    }
    System.out.print(sb);
  }

  static void dfs(int y, int x) {
    if (y > 0 && !graph[y-1][x]) {
      graph[y-1][x] = true;
      dfs(y-1,x);
      count++;
    }
    if (y < m-1 && !graph[y+1][x]) {
      graph[y+1][x] = true;
      dfs(y+1,x);
      count++;
    }
    if (x > 0 && !graph[y][x-1]) {
      graph[y][x-1] = true;
      dfs(y,x-1);
      count++;
    }
    if (x < n-1 && !graph[y][x+1]) {
      graph[y][x+1] = true;
      dfs(y, x+1);
      count++;
    }
  }
}