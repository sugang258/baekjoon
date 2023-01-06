import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class Main {	

	static int n;
	static Stack<Integer> stack = new Stack<>();

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		n = Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++) {
			String str = br.readLine();
			run(str);
		}
	}
	
	static void run(String str) {
		
		if(str.equals("top")) {
			if(stack.size() == 0) {
				System.out.println("-1");
			}else {
				System.out.println(stack.peek());
			}
		}
		
		else if(str.equals("size")) {
			System.out.println(stack.size());
		}
		
		else if(str.equals("empty")) {
			if(stack.empty() == true) {
				System.out.println("1");
			}else {
				System.out.println("0");
			}
		}
		
		else if(str.equals("pop")) {
			if(stack.size() == 0) {
				System.out.println("-1");
			}else {
				System.out.println(stack.peek());
				stack.pop();
			}
		}
		
		else if(str.contains("push")) {
			String spt[] = str.split(" ");
			stack.push(Integer.parseInt(spt[1]));
			
		}
	}
	
}