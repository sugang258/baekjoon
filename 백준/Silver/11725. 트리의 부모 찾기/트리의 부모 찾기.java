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
	
	static StringTokenizer st;
	

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		check = new boolean[N+1];
		ar = new ArrayList[N+1];
		parent = new int[N+1];
		
		for(int i=0;i<N+1;i++) {
			ar[i] = new ArrayList<>();
		}
		
		for(int i = 0;i<N-1;i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			ar[a].add(b);
			ar[b].add(a);
		}
		
		dfs(1);
		
		for(int i =2;i<parent.length;i++) {
			System.out.println(parent[i]);
		}
		
		
	}
	
	static void dfs(int i) {
		check[i] = true;
		
		for(int index : ar[i]) {
			if(!check[index]) {
				parent[index] = i;
				dfs(index);
			}
		}
		
	}
}
	