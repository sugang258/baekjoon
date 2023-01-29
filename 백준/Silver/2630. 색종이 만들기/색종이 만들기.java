import java.io.IOException;
import java.util.Scanner;

public class Main {	
	
	static int[][] ar;
	static int white;
	static int blue;
	
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
		
		System.out.println(white);
		System.out.println(blue);

	}
	
	static void search(int row, int col, int size) {
		
		if(check(row,col,size)) {
			if(ar[row][col] == 0) {
				white++;
			}else {
				blue++;
			}
			return;
		}
		
		int newsize = size / 2;
		
		search(row, col+newsize, newsize);
		search(row, col, newsize);
		search(row+newsize, col, newsize);
		search(row+newsize, col+newsize, newsize);
		
	}
	
	static boolean check(int row, int col, int size) {
		
		int color = ar[row][col];
		
		for(int i=row;i<row + size;i++) {
			for(int j=col;j<col + size;j++) {
				if(ar[i][j] != color) {
					return false;
				}
			}
			
		}
		return true;
	}
}
	