import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int first = 2;
		int answer = 0;
		
		for(int i =0 ; i<n;i++) {
			first = first * 2 - 1;
			answer = (int) Math.pow(first, 2);
		}
		System.out.println(answer);

	}
}
