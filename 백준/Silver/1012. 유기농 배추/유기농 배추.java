import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {	
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();
	
	static int[][] ar;
	static boolean[][] check;
	
	static int count;
	static int number;
	static int M,N,K;
	
	public static void main(String[] args) throws IOException {

		int T = Integer.parseInt(br.readLine());
		
		for (int i=0;i<T;i++) {
			count = 0;
			st = new StringTokenizer(br.readLine()," ");
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			
			ar = new int[M][N];
			check = new boolean[M][N];
			
			K = Integer.parseInt(st.nextToken());
			
			for(int j = 0;j<K;j++) {
				st = new StringTokenizer(br.readLine(), " ");
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				ar[a][b] = 1;
			}
			
			for(int x = 0;x<M;x++) {
				for(int y=0;y<N;y++) {
					if(ar[x][y] == 1 && !check[x][y]) {
						dfs(x,y);
						count++;
					}
				}
			}
			
		System.out.println(count);
		}
	}
	
	static void dfs(int x, int y) {
		
		int[] lr = {0,-1,0,1};
		int[] ud = {1,0,-1,0};
		
		int newx = 0;
		int newy = 0;
		
		check[x][y] = true;
	
		
		for(int i=0;i<4;i++) {
			newx = lr[i] + x;
			newy = ud[i] + y;
			
			if(check(newx,newy) && check[newx][newy] == false && ar[newx][newy] ==1) {				
				dfs(newx,newy);
			}
		}
	}
	
	static boolean check(int x, int y) {
		return (x >= 0 && x < M && y>=0 && y<N);
	}
	
	
}
	