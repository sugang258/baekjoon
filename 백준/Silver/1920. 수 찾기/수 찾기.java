import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {	
	
	static int[] ar;
	static int count;
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ar = new int[n];
		
		for(int i =0;i<n;i++) {
			ar[i] = sc.nextInt();
		}
		
		Arrays.sort(ar);
		
		int x = sc.nextInt();
		
		for(int i=0;i<x;i++) {
			if(search(sc.nextInt()) >= 0 ) {
				System.out.println(1);
			}
			else {
				System.out.println(0);
			}
		}
		
	}
	
	static int search(int x) {
		
		
		int lo = 0;
		int hi = ar.length -1;
		
		while(lo <= hi) {
			int mid = (lo + hi) / 2;
			
			if(x < ar[mid]) {
				hi = mid -1;
			}
			
			else if(x > ar[mid]) {
				lo = mid + 1;
			}
			
			else {
				return mid;
			}
		}
		
		return -1;
		
	}	
}