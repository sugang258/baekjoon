import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    static int n,m;
    static char[][] ar;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
;

        n =Integer.parseInt(st.nextToken());
        m =Integer.parseInt(st.nextToken());
        ar = new char[n][m];
        visited = new boolean[n][m];

        for(int i=0;i<n;i++) {
            String row = br.readLine();
            for(int j=0;j<m;j++) {
                ar[i][j] = row.charAt(j);
            }
        }

        int cnt = 0;

        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(visited[i][j]) {
                    continue;
                }
                if(ar[i][j] == '-') {
                    dfs(i,j,true);
                }else {
                    dfs(i,j,false);
                }
                cnt++;
            }
        }
        System.out.println(cnt);

    }
    private static void dfs(int i, int j, boolean row) {
        visited[i][j] = true;

        if(row) {
            j++;
            if(j<m && ar[i][j] == '-') {
                dfs(i,j,true);
            }

        }else {
            i++;
            if(i < n && ar[i][j] != '-') {
                dfs(i, j, false);
            }

        }
    }
}
