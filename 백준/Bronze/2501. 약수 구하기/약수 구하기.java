import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		int p = sc.nextInt();
		int q = sc.nextInt();
		
		int[] ar = new int[p];

		int count =0;
		
		for(int i=1;i<=p;i++) {
			if(p%i == 0) {
				ar[count] = i;
				count++;
			}
		}

		System.out.println(ar[q-1]);

	}
}