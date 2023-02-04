import java.io.IOException;
import java.util.Scanner;

public class Main {	
	
	static long[][] ar;
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		
		ar = new long[][] {{1,1},{1,0}};
		
		System.out.println(mul(n)[0][1]);
	}
	
    //제곱
	static long[][] mul(long n){
		if(n == 1) {
			return ar;
		}
		
		long[][] arr = null;
		if(n % 2 == 0) {
			arr = mul(n/2);
			return cal(arr, arr);
		}
		else {
			arr = mul((n-1)/2);
			return cal(ar,cal(arr, arr));
		}
	}
	
    //행렬곱셈
	static long[][] cal(long[][] a, long[][] b) {
		
		long[][] result = new long[2][2];
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				int sum = 0;
				for(int k=0;k<2;k++) {
					
					sum += (a[i][k] * b[k][j]) % 1000000007;
				}
				result[i][j] = sum % 1000000007;
			}
		}
		return result;
		
	}
}
	