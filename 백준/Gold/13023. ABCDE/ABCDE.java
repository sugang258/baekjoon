import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {	
	
	static ArrayList<ArrayList<Integer>> ar;
	static boolean[] check;
	
	static int count;
	static int N,M;
	static StringTokenizer st;
	static boolean choice;
	static int result;
	

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		check = new boolean[N];
		ar = new ArrayList<>();
		
		result = 0;
		
		for(int i=0;i<N;i++) {
			ar.add(new ArrayList<>());
		}
		
		for(int i =0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			ar.get(a).add(b);
			ar.get(b).add(a);
		}
		
		for(int i = 0;i<N;i++) {
			Arrays.fill(check, false);
			dfs(i,1);
			if(choice) {
				result = 1;
				break;
			}
		}
		System.out.println(result);
		
	}
	
	static void dfs(int start,int count) {
		
		if(count == 5) {
			choice = true;
			return;
		}
		
		check[start] = true;
		
		for(int i :ar.get(start)) {
			if(!check[i]) {
				dfs(i,count+1);
			}
			
			if(choice) {
				return;
			}
		}
		check[start] = false;
		
		
	}
}
	