import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a == 60 && b == 60 && c == 60) {
			System.out.println("Equilateral");
		}
		
		else if(a + b + c == 180) {
			if((a == b) || (a == c) || (b == c))  {
				System.out.println("Isosceles");
			}
			
			else if((a != b) && (a != c) && (b != c) ) {
				System.out.println("Scalene");
			}
			
			
		}
		else {
			System.out.println("Error");
		}
	}
}