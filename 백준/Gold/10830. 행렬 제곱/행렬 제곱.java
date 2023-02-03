import java.io.IOException;
import java.util.Scanner;

public class Main {	
	
	static int[][] A;
	
	static int N;

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		long B = sc.nextLong();
		
		A = new int[N][N];
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				A[i][j] = sc.nextInt() % 1000;
			}
		}
		
		int[][] total = cal(B);
		print(total);
		
		
	}
	
	static int[][] cal(long B) {
		
		if(B == 1L) {
			return A;
		}
		
		int[][] cal = cal(B/2);
		
		cal = mul(cal,cal);
		
		if(B % 2 == 1L) {
			cal = mul(cal,A);
		}
		
		return cal;
		
	}
	
	
	static int[][] mul(int[][] A, int[][] cal){
		int[][] result = new int[N][N];
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				for(int k=0;k<N;k++) {
					result[i][j] += (A[i][k] * cal[k][j]);
					result[i][j] %= 1000;
				}
			}
		}
		return result;
		
	}
	
	static void print(int[][] cal) {
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				System.out.print(cal[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	
	
}
	