import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main {	

	static String str;
	static String result;

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			str = sc.next();
			run();
			System.out.println(result);

		}
	}
	
	static void run() {
        
		Stack<Character> stack = new Stack<>();
        
		if(str.charAt(0)== ')'){
			result = "NO";
			return;
		}
		
		for(int i=0;i<str.length();i++) {
            
			char s = str.charAt(i);
			
			if(s == '(') {
				stack.push(s);
			}
			else if(s == ')') {
				
				if(stack.empty()) {
					result = "NO";
					return;
				}else {
					stack.pop();
				}
			}
		}
		if(stack.size() == 0) {
			result = "YES";
		}else {
			result = "NO";
		}
	}
}