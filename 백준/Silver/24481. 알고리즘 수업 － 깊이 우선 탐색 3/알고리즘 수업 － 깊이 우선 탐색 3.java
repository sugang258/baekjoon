import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int n,m,r;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] check;
    static int count;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken())-1;

        graph = new ArrayList<>();
        check = new int[n];


        for(int i=0;i<n;i++) {
            graph.add(new ArrayList<>());
            check[i] = -1;
        }

        for(int i=0;i<m;i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken())-1;
            int v = Integer.parseInt(st.nextToken())-1;

            graph.get(u).add(v);
            graph.get(v).add(u);

        }

        for(int i=0;i<graph.size();i++) {
            Collections.sort(graph.get(i));
        }

        check[r] = 0;
        dfs(r);

        for(int i =0;i<check.length;i++) {

                sb.append((check[i])+"\n");

        }
        System.out.println(sb);
    }

    private static void dfs(int n) {


        for(int i=0;i<graph.get(n).size();i++) {
            int newN = graph.get(n).get(i);

            if(check[newN] == -1) {
                check[graph.get(n).get(i)] = check[n] + 1;
                dfs(newN);
            }
        }

    }

}
