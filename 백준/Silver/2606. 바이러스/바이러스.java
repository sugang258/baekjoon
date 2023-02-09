import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {	
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();
	
	static ArrayList<ArrayList<Integer>> ar = new ArrayList<>();
	static int[] check;
	static int count;
	
	public static void main(String[] args) throws IOException {
		
		
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		check = new int[N + 1];
		
		for(int i=0;i<N+1;i++) {
			ar.add(new ArrayList<>());
		}
		
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			ar.get(u).add(v);
			ar.get(v).add(u);
		}
		count = 0;
		
		dfs(1);
		System.out.println(count-1);
		
	}
	
	static void dfs(int v) {
		
		check[v] = count;
		
		for(int i=0;i<ar.get(v).size();i++) {
			int newVertex = ar.get(v).get(i);
			
			if(check[newVertex] == 0) {
				count++;
				dfs(newVertex);
			}
		}

	}
		
	
	
}
	