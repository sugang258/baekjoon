import java.io.IOException;
import java.util.Scanner;

public class Main {	
	
	static char[][] ar;
	static boolean[][] check;
	
	static int count;
	static int N;

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		ar = new char[N][N];
		check = new boolean[N][N];
		
		count = 0;
		
		//정상 사람
		for(int i=0;i<N;i++) {
			String s = sc.next();
			for(int j=0;j<N;j++) {
				ar[i][j] = s.charAt(j);
			}
		}
		
		for(int i = 0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(!check[i][j]) {
					dfs(i,j);
					count++;
				}
			}
		}
		System.out.print(count + " ");
		
		//적록색약인 사람
		count = 0;
		check = new boolean[N][N];
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(ar[i][j] == 'R') {
					ar[i][j] = 'G';
				}
			}
		}
		
		for(int i=0;i<N;i++) {
			for(int j = 0;j<N;j++) {
				if(!check[i][j]) {
					dfs(i,j);
					count++;
				}
			}
		}
		
		System.out.print(count);
	}
	
	static void dfs(int x, int y) {
		
		int[] dirx = {-1,1,0,0};
		int[] diry = {0,0,-1,1};
		
		char now = ar[x][y];
		int newx = 0;
		int newy = 0;
		
		check[x][y] = true;
		
		for(int i=0;i<4;i++) {
			newx = dirx[i] + x;
			newy = diry[i] + y;
			
			if(check(newx, newy) && check[newx][newy] == false && ar[newx][newy] == now) {
				dfs(newx, newy);
			}	
		}		
	}
	
	static boolean check(int x, int y) {
		return (x >=0 && x < N && y >= 0 && y <N);
	}
}
	