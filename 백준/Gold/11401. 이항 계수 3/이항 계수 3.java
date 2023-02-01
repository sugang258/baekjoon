import java.io.IOException;
import java.util.Scanner;

public class Main {	
	
	static long p = 1000000007;

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextLong();
		long K = sc.nextLong();
		
		long de = factorial(K) * factorial(N-K) % p;
		long mo = factorial(N) ;
		
		long total = mo * search(de, p-2) % p;
		System.out.println(total);
	}
	
	static long search(long N, long K) {
		
		if(K == 1) {
			return N % p;
		}
		
		long temp = search(N, K/2);
		
		if(K % 2 == 1) {
			return (temp * temp % p) * N % p;
		}
		
		return temp * temp % p;
	}
	
	static long factorial(long N) {
		long result = 1l;
		
		for(long i = N;i>0;i--) {
			result = result * i % p;
		}
		return result;
	}
}
	