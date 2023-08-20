import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	static String[] ch = {"0","1","2","3","4","5","6","7","8","9","A",
			"B","C","D","E","F","G","H","I","J","K","L",
			"M","N","O","P","Q","R","S","T","U","V","W",
			"X","Y","Z"};
	

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		int n = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		while(s >= n) {
			int mod = s%n;
			s = s/n;

			sb.insert(0,ch[mod]);

		}
			sb.insert(0,ch[s]);
		
		System.out.println(sb);
	}
}
