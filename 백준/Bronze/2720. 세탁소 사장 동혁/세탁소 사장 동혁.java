import java.io.IOException;
import java.util.Scanner;

public class Main {

	static int quarter = 25;
	static int dime = 10;
	static int nickel = 5;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			int q, d, ni, p =0;
			int change = sc.nextInt();
				q = change / quarter;
				change %= quarter;
				
				d = change / dime;
				change %= dime;
				
				ni = change / nickel;
				change %= nickel;
				
				p = change;
				
				System.out.println(q + " " + d + " " + ni + " " + p);
		}
	}
}
