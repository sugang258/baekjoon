import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class Main {	

	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		int[] ar = new int[n];
		
		for(int i=0;i<n;i++) {
			ar[i] = sc.nextInt();
		}
		
		Arrays.sort(ar);
		int total= 0;
		int sum =0;

		for(int i=0;i<n;i++) {
			total += sum + ar[i];
			sum += ar[i];
		}
		System.out.println(total);

	}
}