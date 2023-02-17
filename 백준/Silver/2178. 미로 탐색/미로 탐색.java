import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {	
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	
	static int[][] ar;
	static boolean[][] check;
	
	static int M,N;
	
	public static void main(String[] args) throws IOException {

		st = new StringTokenizer(br.readLine()," ");
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		ar = new int[N][M];
		check = new boolean[N][M];
				
		for(int i=0;i<N;i++) {
			String str = br.readLine();
			for(int j=0;j<M;j++) {
				ar[i][j] = Character.getNumericValue(str.charAt(j));
			}
		}
		
		check[0][0] = true;
		bfs(0,0);
	
		System.out.println(ar[N-1][M-1]);
		
	}

	static void bfs(int x, int y) {
		
		int[] lr = {0,0,-1,1};
		int[] ud = {-1,1,0,0};
		
		Queue<int []> queue = new LinkedList<>();
		
		queue.add(new int[] {x,y});
		
		while(!queue.isEmpty()) {
			int neww[] = queue.poll();
			int newx = neww[0];
			int newy = neww[1];
			
			for(int i=0;i<4;i++) {
				int nextx = newx + lr[i];
				int nexty = newy + ud[i];
				
				if(check(nextx,nexty)) {
					continue;
				}
				if(check[nextx][nexty] || ar[nextx][nexty] == 0) {
					continue;
				}
				
				queue.add(new int[] {nextx, nexty});
				ar[nextx][nexty] = ar[newx][newy] + 1;
				check[nextx][nexty] = true;
			}
		}
	}
	
	static boolean check(int x, int y) {
		return (x < 0 || x >= N || y < 0 || y >= M);
	}
	
	
}
	