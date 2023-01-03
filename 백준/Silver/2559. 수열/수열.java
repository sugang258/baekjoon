import java.io.IOException;
import java.util.Scanner;

public class Main {	

	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int day = sc.nextInt();
		int[] ar = new int[n];
		
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++) {
			ar[i] = sc.nextInt();
		}
		
		for(int i=0;i<n-day+1;i++) {
			int hop=0;
			for(int j=i;j<i+day;j++) {
				hop += ar[j];
			}
			
			max = Math.max(max, hop);
		}
		
		System.out.println(max);

	}

}