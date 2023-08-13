import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length()/2;
		int check = 1;
		
		for(int i=1; i<=n; i++) {
			if(s.charAt(i-1) != s.charAt(s.length()-i)) {
				check = 0;
				break;
			}
		}
		System.out.println(check);
	}
}
