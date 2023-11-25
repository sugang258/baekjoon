import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;


public class Main {

	static Stack<Integer> stack = new Stack<>();
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		while(n --> 0) {
			
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());

			switch(a) {
			case 1:
				add(Integer.parseInt(st.nextToken()));
				break;
			
			case 2:
				pop();
				break;
			
			case 3:
				count();
				break;
			
			case 4:
				empty();
				break;
			
			case 5:
				peek();
				break;
			}
			
		}
		System.out.println(sb);
	}
	
	static void add(int number) {
		stack.add(number);
	}
	
	static void pop() {
		if(stack.empty()) {
			sb.append("-1 \n");
		}else {
			sb.append(stack.pop()).append("\n");
		}
	}
	
	static void count() {
		sb.append(stack.size()).append("\n");
	}
	
	static void empty() {
		if(stack.empty()) {
			sb.append("1").append("\n");
		}else {
			sb.append("0").append("\n");
		}
	}
	
	static void peek() {
		if(stack.empty()) {
			sb.append("-1").append("\n");
		}else {
			sb.append(stack.peek()).append("\n");
		}
	}
	
}