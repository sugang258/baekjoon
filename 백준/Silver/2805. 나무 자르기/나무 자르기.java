import java.io.IOException;
import java.util.Scanner;

public class Main {	
	
	static int[] ar;
	static int max;
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		ar = new int[n];
		max = 0;
		
		for(int i=0;i<n;i++) {
			ar[i] = sc.nextInt();
			if(max <ar[i]) {
				max = ar[i];
			}
		}
		
		search(m);
	}
	
	static void search(int m) {
		
		int min = 0;
		
		while(min < max) {
			
			int mid = (min + max) / 2;
			long sum = 0;
			
			for(int h : ar) {
				if(h - mid > 0) {
					sum += h - mid;
				}
			}
			
			if(sum < m) {
				max = mid;
			}
			else {
				min = mid + 1;
			}

		}
		
		System.out.println(min - 1);
		
	
	}
	
}