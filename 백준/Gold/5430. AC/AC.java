import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {	
	
	static ArrayDeque<Integer> deque = new ArrayDeque<>();
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i =0;i<t;i++) {
			
			String str = br.readLine();
			int n = Integer.parseInt(br.readLine());
			
			deque = new ArrayDeque<Integer>();
			
			st = new StringTokenizer(br.readLine(),"[],");
			
			for(int j=0;j<n;j++) {
				deque.add(Integer.parseInt(st.nextToken()));
			}
			
			System.out.println(ac(str));
		}
	}
	
	
	static String ac(String str) {
		boolean reverse = false;
		
		for(char cmd : str.toCharArray()) {
			
			if(cmd == 'R') {
				reverse = !reverse;
			}
			else {
				if(deque.size() == 0) {
					return "error";
				}
				
				if(reverse) {
					deque.removeLast();
				}else {
					deque.removeFirst();
				}
			}
		}
			
		result(reverse);
		return sb.toString();
		
	}
	
	
	static void result(boolean reverse) {
		sb = new StringBuilder("[");
		 while (!deque.isEmpty()) {
			 
			 if(reverse) {
				 sb.append(deque.removeLast());
			 }else {
				 sb.append(deque.removeFirst());
			 }
			 
	         if (deque.size() != 0) {
	            sb.append(',');
	         }
	     }
	        sb.append(']');
	}
		
}