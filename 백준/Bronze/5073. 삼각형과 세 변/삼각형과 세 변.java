import java.io.IOException;
import java.util.Scanner;

public class Main {

	static int sum;

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			
			if(a == 0) {
				break;
			}
			int[] ar = new int[3];
			ar[0] = a;
			ar[1] = b;
			ar[2] = c;
			
			int max =0;
			int count = 0;
			sum = 0;
			for(int i=0;i<3;i++) {
				if(ar[i] > max) {
					max = ar[i];
					count = i;
				}
			}
			
			sum = condition1(count,ar);


			if(check(sum,max) == false) {
				System.out.println("Invalid");
			}
			
			else if(condition2(a,b,c)) {
				System.out.println("Equilateral");
			}
			else if(condition3(a,b,c)) {
				System.out.println("Isosceles");
			}
			else if(condition4(a,b,c)) {
				System.out.println("Scalene");
			}
			
			
			
		}
		
	}
	
	static int condition1(int count, int[] ar) {
		
		int sum = 0;
		
		for(int i =0;i<3;i++) {
			if(i != count) {
				sum += ar[i];
			}
		}
		return sum;
	}
	
	static boolean condition2(int a, int b, int c) {
		if((a == b) && (b == c)) {
			return true;
		}
		return false;
	}
	
	static boolean condition3(int a, int b, int c) {
		if((a == b) || (a == c) || (b == c)) {
			return true;
		}
		return false;
	}
	
	static boolean condition4(int a, int b, int c) {
		if((a != b) || (a != c) || ( b != c)) {
			return true;
		}
		return false;
	}
	
	static boolean check(int sum, int max) {
		if(sum <= max) {
			return false;
		}
		return true;
	}
}