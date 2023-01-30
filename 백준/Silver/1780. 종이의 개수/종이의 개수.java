import java.io.IOException;
import java.util.Scanner;

public class Main {	
	
	static int[][] ar;
	static int m_one;
	static int zero;
	static int one;

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		ar = new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				ar[i][j] = sc.nextInt();
			}
		}
		search(0,0,n);
		
		System.out.println(m_one);
		System.out.println(zero);
		System.out.println(one);
		
	}
	
	static void search(int row, int col, int size) {
		
		if(check(row,col,size)) {
			int init = ar[row][col];
			
			if(init == -1) {
				m_one++;
			}
			else if(init == 0) {
				zero++;
			}
			else {
				one++;
			}
			return;
		}
		
		int newsize = size / 3;
		int newsize2 = newsize*2;
		
		search(row,col,newsize);
		search(row+newsize,col,newsize);
		search(row+newsize2,col,newsize);
		search(row,col+newsize,newsize);
		search(row+newsize,col+newsize,newsize);
		search(row+newsize2,col+newsize,newsize);
		search(row,col+newsize2,newsize);
		search(row+newsize,col+newsize2,newsize);
		search(row+newsize2,col+newsize2,newsize);
	
	}
	
	static boolean check(int row, int col, int size) {
		
		int init = ar[row][col];
		
		for(int i=row;i<row+size;i++) {
			for(int j=col;j<col+size;j++) {
				if(ar[i][j] != init) {
					return false;
				}
			}
		}
		
		return true;
	}
}
	