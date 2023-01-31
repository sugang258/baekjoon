import java.io.IOException;
import java.util.Scanner;

public class Main {	

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		
		System.out.println(search(a,b,c));
	}
	
	static long search(long a, long b, long c) {
		
		if(b == 1) {
			return a % c;
		}
		
		long temp = search(a, b/2, c);
		
		if(b % 2 == 1) {
			return (temp * temp % c) * a % c;
		}
		
		return temp * temp % c;
	}
}
	