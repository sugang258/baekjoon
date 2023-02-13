import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int[][] ar;
	static boolean[] check;
	static int count;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=0;i<T;i++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			count = 0;
			
			ar = new int[N+1][N+1];
			check = new boolean[N+1];
			
			for(int j=0;j<M;j++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				
				ar[a][b] = 1;
				ar[b][a] = 1;
			}
			bfs(N);
			System.out.println(count-1);
		}

	}
	
	static void bfs(int N) {
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		queue.add(1);
		check[1] = true;
		
		while(!queue.isEmpty()) {
			count++;
			int next = queue.poll();
			
			for(int i=1;i<=N;i++) {
				if(ar[next][i] != 0 && !check[i]) {
					check[i] = true;
					queue.add(i);
				}
			}
			
			
		}
		
	}

}
