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
	static int[] check;
	static int count;
	
	public static void main(String[] args) throws IOException {
		
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		
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

		for(int i=0;i<=N;i++) {
			Collections.sort(ar.get(i));
		}
		
		bfs(R);
		
		for(int i=1;i<=N;i++) {
			System.out.println(check[i]);
		}
	}
	
	static void bfs(int v) {
		
		Queue<Integer> queue = new LinkedList<Integer>();
		count = 1;
		
		queue.offer(v);
		check[v] = count++;
		
		while(!queue.isEmpty()) {
			int a = queue.poll();
			
			for(int i=0;i<ar.get(a).size();i++) {
				int nextVertex = ar.get(a).get(i);
				
				if(check[nextVertex] != 0) {
					continue;
				}
				
				queue.offer(nextVertex);
				check[nextVertex] = count++;
			}
		}
		
	}
}
	