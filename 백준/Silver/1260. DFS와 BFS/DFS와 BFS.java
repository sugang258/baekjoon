import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {	
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();
	
	static ArrayList<ArrayList<Integer>> ar = new ArrayList<>();
	static boolean[] check;
	
	public static void main(String[] args) throws IOException {
		
		st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		
		check = new boolean[N + 1];
		
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
		
		sort();
				
		dfs(R);
		
		System.out.println();
		
		check = new boolean[N + 1];
		
		bfs(R);

	}
	
	static void sort() {
		for(int i=1;i<ar.size();i++) {
			Collections.sort(ar.get(i));
		}
	}
	
	static void dfs(int v) {
		
		check[v] = true;
		System.out.print(v + " ");
		for(int i=0;i<ar.get(v).size();i++) {
			int newVertex = ar.get(v).get(i);
			
			if(check[newVertex] == false) {
				dfs(newVertex);
			}
		}
	}
	
	static void bfs(int v) {

		Queue<Integer> queue = new LinkedList<Integer>();
				
		queue.offer(v);
		
		check[v] = true;
		
		while(!queue.isEmpty()) {
			int a = queue.poll();
			
			System.out.print(a + " ");
			
			for(int i=0;i<ar.get(a).size();i++) {
				int nextVertex = ar.get(a).get(i);
				
				if(check[nextVertex] != false) {
					continue;
				}
				queue.offer(nextVertex);
				check[nextVertex] = true;
			}
		}	
	}
}
	