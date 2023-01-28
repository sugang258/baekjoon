import java.io.IOException;
import java.util.Scanner;

public class Main {	
	
	static int[] ar;
	static int[] LIS;
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		ar = new int[n];
		LIS = new int[n];
		
		for(int i=0;i<n;i++) {
			ar[i] = sc.nextInt();
		}
		
		search(n);
	}
	
	static void search(int n) {
		
		LIS[0] = ar[0];
		int length = 1;
		
		for(int i=1;i<n;i++) {
			int key = ar[i];
			
			if(LIS[length-1] < key) {
				length++;
				LIS[length-1] = key;
			}
			else {
				int lo = 0;
				int hi = length;
				
				while(lo < hi) {
					int mid = (lo + hi) / 2;
					
					if(LIS[mid] < key) {
						lo = mid + 1;
					}
					else {
						hi = mid;
					}
				}
				
				LIS[lo] = key;
			}
				
		}
		System.out.println(length);
		
		
	}
}
	