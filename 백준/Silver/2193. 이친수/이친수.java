import java.io.IOException;
import java.util.Scanner;

public class Main {	
	
	static long[] ar;
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		ar = new long[n+1];
		System.out.println(search(n));
		
	}
	
	static long search(int n) {
		
		if(n == 0) {
			return 0;
		}
		if(n == 1) {
			return 1;
		}
		if(ar[n] > 0) {
			return ar[n];
		}
		ar[n] = search(n-1) + search(n-2);
		return ar[n];
	}
}
	