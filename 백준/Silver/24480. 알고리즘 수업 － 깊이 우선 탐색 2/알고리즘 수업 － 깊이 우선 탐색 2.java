import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
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
		
		int vertex = Integer.parseInt(st.nextToken());
		int edge = Integer.parseInt(st.nextToken());
		int start = Integer.parseInt(st.nextToken());
		
		check = new int[vertex+1];
		
		for(int i=0;i<vertex+1;i++) {
			ar.add(new ArrayList<>());
		}
		
		for(int i=0;i<edge;i++) {
			st = new StringTokenizer(br.readLine());
			int fromVertex = Integer.parseInt(st.nextToken());
			int toVertex = Integer.parseInt(st.nextToken());
			
			ar.get(fromVertex).add(toVertex);
			ar.get(toVertex).add(fromVertex);
		}
		
		for(int i=1;i<ar.size();i++) {
			Collections.sort(ar.get(i),Collections.reverseOrder());
		}
		
		count = 1;
		
		dfs(start);
		
		for(int i=1;i<check.length;i++) {
			sb.append(check[i]).append("\n");
		}
		System.out.println(sb);
		
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
	