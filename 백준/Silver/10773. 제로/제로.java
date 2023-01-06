import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main {	

	static int n;
	static Stack<Integer> stack = new Stack<>();
	static int a;
	
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			a = sc.nextInt();
			run();
		}
		System.out.println(sum());
		
	}
	
	static void run() {
		if(a != 0) {
			stack.push(a);
		}else {
			stack.pop();
		}
	}
	
	static int sum() {
		int total = 0;
		for(int i=0;i<stack.size();i++) {
			total += stack.get(i);
		}
		return total;
	}

}