import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		
		int max_x = -10001, max_y = -10001;
		int min_x = 10001, min_y = 10001;
		
		int total =0;
	
		for(int i=0; i<n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			max_x = Integer.max(max_x, x);
			max_y = Integer.max(max_y, y);
			
			min_x = Integer.min(min_x, x);
			min_y = Integer.min(min_y, y);
		}
		
		
		total = (max_x - min_x) * (max_y - min_y);
		
		if(n == 1 || max_x == min_x || max_y == min_y) {
			total = 0;
		}
		
		System.out.println(total);

	}
}
