import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {	
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();
	
	static int[][] ar;
	static boolean[][] check;
	
	static int count;
	static int number;
	static int N;
	
	public static void main(String[] args) throws IOException {

		List<Integer> list = new ArrayList<>();
		N = Integer.parseInt(br.readLine());
		
		ar = new int[N][N];
		check = new boolean[N][N];
		
		for(int i=0;i<N;i++) {
			String str = br.readLine();
			for(int j=0;j<N;j++) {
				ar[i][j] = Character.getNumericValue(str.charAt(j));
				
			}
		}
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(check[i][j] == false && ar[i][j] == 1) {
					count = 0;
					number++;
					dfs(i,j);
					list.add(count);
				}
			}
		}
		
		Collections.sort(list);
		System.out.println(number);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
	
	static void dfs(int x, int y) {
		
		int[] lr = {0,0,-1,1};
		int[] ud = {-1,1,0,0};
		
		int newx = 0;
		int newy = 0;
		
		check[x][y] = true;
		ar[x][y] = number;
		count++;
	
		
		for(int i=0;i<4;i++) {
			newx = lr[i] + x;
			newy = ud[i] + y;
			
			if(check(newx,newy) && check[newx][newy] == false && ar[newx][newy] ==1) {
				check[newx][newy] = true;
				ar[newx][newy] = number;
				
				dfs(newx,newy);
			}
		}
	}
	
	static boolean check(int x, int y) {
		return (x >= 0 && x < N && y>=0 && y<N);
	}
}
	