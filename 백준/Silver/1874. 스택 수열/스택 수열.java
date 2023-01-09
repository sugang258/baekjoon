import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main {	
	public static void main(String[] args) throws IOException {
		
		Stack<Integer> stack = new Stack<>();
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = sc.nextInt();
		int start = 0;
		while(n-- > 0) {
			int value = sc.nextInt();
			 
			if(value > start) {
				for(int i=start+1;i<=value;i++) {
					stack.push(i);
					sb.append('+').append('\n');
				}
				
				start = value;
			}
            if(stack.peek() == value) {
                stack.pop();
                sb.append('-').append('\n');
            }
			
			else if(stack.peek() != value) {
				System.out.println("NO");
				return;
			}
			
		}
		System.out.println(sb);	
	}

}