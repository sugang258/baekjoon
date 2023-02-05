import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {	
	static PriorityQueue<Integer> pq;
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		pq = new PriorityQueue<>(Collections.reverseOrder());
		
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
	