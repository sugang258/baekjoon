import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {	
	
	static ArrayList<Integer> ar[];
	static int[] parent;
	static boolean[] check;
	
	static int count;
	static int N,M;
	static int result = -1;
	static StringTokenizer st;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		ar = new ArrayList[N+1];
		check = new boolean[N+1];
		
		for(int i=0;i<N+1;i++) {
			ar[i] = new ArrayList<>();
		}
		
		st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		M = Integer.parseInt(br.readLine());
		
		for(int i=0;i<M;i++) {
			
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			ar[a].add(b);
			ar[b].add(a);
		}
		
		dfs(x,y,0);
		System.out.println(result);
		
		
	}
	
	static void dfs(int start, int end, int count) {
		
		if(start == end) {
			result = count;
			return;
		}
		
		check[start] = true;
		
		for(int i=0;i<ar[start].size();i++) {
			int next = ar[start].get(i);
			if(!check[next]) {
				dfs(next, end, count+1);
			}
		}
		
	}
}
	