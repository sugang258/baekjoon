import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {	
	
	static ArrayList<ArrayList<Integer>> ar = new ArrayList<>();
	static boolean[] check;
	
	static int count;
	

	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		check = new boolean[N+1];
		
		for(int i =0;i<N+1;i++) {
			ar.add(new ArrayList<>());
		}
		
		for(int i=0;i<M;i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			
			ar.get(u).add(v);
			ar.get(v).add(u);
		}
		
		sort();
		
		count = 0;
		
		for(int i = 1;i<=N;i++) {
			if(check[i] == false) {
				dfs(i);
				count++;
			}
		}
		
		System.out.println(count);
		
	}
	
	static void sort() {
		for(int i = 0; i<ar.size();i++) {
			Collections.sort(ar.get(i));
		}
	}
	
	
	
	static void dfs(int v) {
		
		check[v] = true;
		
		for(int i=0;i<ar.get(v).size();i++) {
			int newVertex = ar.get(v).get(i);
			
			if(check[newVertex] == false) {
				dfs(newVertex);
			}
		}
		
	}
}
	