import java.io.IOException;
import java.util.Scanner;

public class Main {	
	
	static int[][] ar;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		ar = new int[n][n];
		
		for(int i=0;i<n;i++) {
			String str = sc.next();
			for(int j =0;j<n;j++) {
				ar[i][j] = str.charAt(j) -'0';
			}
		}
		search(0,0,n);
		
		System.out.println(sb);
		
	}
	
	static void search(int row, int col, int size) {
				
		if(check(row,col,size)) {
			if(ar[row][col] == 1) {
				sb.append("1");
			}
			else {
				sb.append("0");
			}
			return;
		}
		
		int newsize = size / 2;
		
		sb.append('(');
		
		search(row,col,newsize);
		search(row,col+newsize,newsize);
		search(row+newsize,col,newsize);
		search(row+newsize,col+newsize,newsize);
		
		sb.append(')');
		
	}
	
	static boolean check(int row, int col, int size) {
		
		int init = ar[row][col];
		
		for(int i=row;i<row+size;i++) {
			for(int j = col;j<col+size;j++) {
				if(ar[i][j] != init) {
					return false;
				}
			}
		}
		
		return true;
	}
}
	