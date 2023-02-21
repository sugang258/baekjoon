import java.io.IOException;
import java.util.Scanner;

public class Main {	
	
	static int[][] ar;
	static boolean[] check;
	
	static int count;
	static int N,M;

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		ar = new int[N][M];
		check = new boolean[26];
		
		count = 0;
		
		for(int i=0;i<N;i++) {
			String s = sc.next();
			for(int j=0;j<M;j++) {
				ar[i][j] = s.charAt(j)-'A';
			}
		}
		
		dfs(0,0,1);
		
		System.out.print(count);

	}
	
	static void dfs(int x, int y, int length) {
		
		int[] dirx = {-1,1,0,0};
		int[] diry = {0,0,-1,1};
		
		check[ar[x][y]] = true;
		
		count = Math.max(count, length);
		
		for(int i=0;i<4;i++) {
			int newx = dirx[i] + x;
			int newy = diry[i] + y;
			
			if(check(newx, newy) && check[ar[newx][newy]] == false) {
				dfs(newx, newy,length+1);
				check[ar[newx][newy]] = false;
			}	
		}		
	}
	
	static boolean check(int x, int y) {
		return (x >=0 && x < N && y >= 0 && y <M);
	}
}
	