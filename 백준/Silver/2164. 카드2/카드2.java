import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {	
	
	static Queue<Integer> queue = new LinkedList<>();
	static int back = 0;

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			queue.add(i);
		}
		run();
		System.out.println(queue.peek());
	}
	
	
	static void run() {
		
		while(queue.size() > 1) {
			queue.poll();
			
			
			back = queue.poll();
			queue.add(back);
			
		}
	}
}