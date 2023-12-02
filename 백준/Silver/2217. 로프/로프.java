import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		
		for(int i=0;i<n;i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(a);
		
		int max = 0;
		int sum = 0;
		for(int i=0;i<n;i++) {
			sum = a[i] * (n-i);
			
			if(sum > max) {
				max = sum;
			}
		}
		System.out.println(max);	
	}
}