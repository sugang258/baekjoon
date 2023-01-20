import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {	
	
	static Deque<Integer> deque = new LinkedList<>();
	static StringBuffer sb = new StringBuffer();

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i =0;i<n;i++) {
			String[] s = br.readLine().split(" ");
			
			switch(s[0]) {
				case "push_front" : push_f(s[1]);
					break;
				case "push_back" : push_b(s[1]);
					break;
				case "pop_front" : pop_f();
					break;
				case "pop_back" : pop_b();
					break;
				case "size" : size();
					break;
				case "empty" : empty();
					break;
				case "front" : front();
					break;
				case "back" : back();
					break;
			}
		}
		System.out.println(sb);
	}
	
	
	static void push_f(String str) {
		deque.addFirst(Integer.parseInt(str));
	}
	
	static void push_b(String str) {
		deque.addLast(Integer.parseInt(str));
	}
	
	static void pop_f() {
		if(deque.isEmpty()) {
			sb.append("-1").append("\n");
		}else {
			sb.append(deque.pollFirst()).append("\n");
		}
	}
	
	static void pop_b() {
		if(deque.isEmpty()) {
			sb.append("-1").append("\n");
		}else {
			sb.append(deque.pollLast()).append("\n");
		}
	}
	
	static void size() {
		sb.append(deque.size()).append("\n");
	}
	
	static void empty() {
		if(deque.isEmpty()) {
			sb.append("1").append("\n");
		}else {
			sb.append("0").append("\n");
		}
	}
	
	static void front() {
		if(deque.isEmpty()) {
			sb.append("-1").append("\n");
		}else {
			sb.append(deque.getFirst()).append("\n");
		}
	}
	
	static void back() {
		if(deque.isEmpty()) {
			sb.append("-1").append("\n");
		}else {
			sb.append(deque.getLast()).append("\n");
		}
	}
	
}