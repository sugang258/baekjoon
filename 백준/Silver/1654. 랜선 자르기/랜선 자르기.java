import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {	
	
	static int[] ar;
	static int count;
	static long max;
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		int n = sc.nextInt();
		
		ar = new int[k];
		max = 0;
		
		for(int i=0;i<k;i++) {
			ar[i] = sc.nextInt();
			if(max < ar[i]) {
				max = ar[i];
			}
		}
		
		max++;
		
		search(n);

		
		
		
	}
	
	static void search(int n) {
		
		long min = 0;
		long mid = 0;
		
		while(min < max) {
			mid = (min + max) / 2;
			
			long count = 0;
			
			for(int i=0;i<ar.length;i++) {
				count += (ar[i] / mid);
			}
			
			if(count < n) {
				max = mid;
			}
			else {
				min = mid + 1;
			}
		}
		
		
		System.out.println(min - 1);
		
	}	
}