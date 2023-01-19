import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {	
	
	static LinkedList<int[]> queue;
	static int back = 0;

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		
		for(int i=0;i<k; i++) {
			 
			queue = new LinkedList<>();
			
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			for(int y=0;y<n;y++) {
				queue.offer(new int[] {y,sc.nextInt()});
			}
			run(m);
		}
	
		
	}
	
	
	static void run(int k) {
		
		int count = 0;
		
		while(!queue.isEmpty()) {
			
			int[] front = queue.poll();
			boolean max = true;
			
			for(int i = 0;i<queue.size();i++) {
				if(front[1]<queue.get(i)[1]) {
					queue.offer(front);
					for(int j=0;j<i;j++) {
						queue.offer(queue.poll());
					}
					max = false;
					break;
				}
			}
			
			if(max == false) {
				continue;
			}
			
			count++;
			if(front[0] == k) {
				break;
			}
		}
		
		System.out.println(count);
		
		
	}
	
}