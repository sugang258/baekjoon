import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {	
	static PriorityQueue<Integer> pq;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		pq = new PriorityQueue<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				if(Math.abs(o1) > Math.abs(o2)) {
					return Math.abs(o1) - Math.abs(o2);
				}else if(Math.abs(o1) == Math.abs(o2)) {
					return o1 - o2;
				}else {
					return -1;
				}
			}
			
		});
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++) {
			int a = Integer.parseInt(br.readLine());
			cal(a);
		}
		br.close();
	}
	
	static void cal(int a) {
		if(a == 0) {
			if(pq.isEmpty()) {
				System.out.println("0");
				return;
			}
			System.out.println(pq.poll());
		}
		else {
			pq.offer(a);
		}
		
	}
}
	