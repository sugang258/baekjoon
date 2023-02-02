import java.io.IOException;
import java.util.Scanner;

public class Main {	
	
	static int[][] A;
	static int[][] B;
	
	static int[][] C;

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		A = new int[n][m];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				A[i][j] = sc.nextInt();
			}
		}
		
		int M = sc.nextInt();
		int K = sc.nextInt();
		
		B = new int[M][K];
		C = new int[n][K];
		
		for(int i=0;i<M;i++) {
			for(int j=0;j<K;j++) {
				B[i][j] = sc.nextInt();
			}
		}
		
		
		cal(n,K,M);
		print(n, K);
		
	}
	
	static void cal(int n, int K, int M) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<K;j++) {
				int sum =0;
				for(int k=0;k<M;k++) {
					sum += A[i][k] * B[k][j];
				}
				C[i][j] = sum;
				
			}
		}
	}
	
	static void print(int n, int K) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<K;j++) {
				System.out.print(C[i][j] + " ");
			}
			System.out.println();
		}
	}
}
	