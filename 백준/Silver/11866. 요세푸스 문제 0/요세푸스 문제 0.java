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
		int k = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			queue.add(i);
		}
		System.out.print("<");
		run(k);
		
	}
	
	
	static void run(int k) {
		
		while(queue.size() > 1) {
			for(int i =0;i<k-1;i++) {
				int x = queue.poll();
				queue.offer(x);
			}
			System.out.print(queue.poll()+", ");

		}
		System.out.println(queue.poll()+">");
		
	}
	
}