import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {	
	
	static int[] ar;
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int c = sc.nextInt();
		
		ar = new int[n];
		
		for(int i=0;i<n;i++) {
			ar[i] = sc.nextInt();
		}
		
		Arrays.sort(ar);
		
		search(n,c);
		
	}
	
	static void search(int n, int c) {
		
		int lo = 1;
		int hi = ar[n-1] - ar[0] + 1;
		
		while(lo < hi) {
			int mid = (hi + lo) / 2;
			
			if(install(mid) < c) {
				hi = mid;
			}
			else {
				lo = mid + 1;
			}
			
			
		}
		System.out.println(lo - 1);
		
	
	}
	
	static int install(int d) {
		
		int count = 1;
		int last = ar[0];
		
		for(int i=1;i<ar.length;i++) {
			int locate = ar[i];
			
			if(locate - last >= d) {
				count++;
				last = locate;
			}
		}
		
		return count;
	}
		
}