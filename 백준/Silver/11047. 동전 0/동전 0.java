import java.io.IOException;
import java.util.Scanner;

public class Main {	

	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] ar = new int[n];
		int count=0;
		for(int i=0;i<n;i++) {
			ar[i] = sc.nextInt();
		}
		
		for(int i=n-1;i>=0;i--) {
			if(ar[i] <= k) {
				count += k/ar[i];
				k = k % ar[i];
			}
		}
		
		System.out.println(count);

	}
}