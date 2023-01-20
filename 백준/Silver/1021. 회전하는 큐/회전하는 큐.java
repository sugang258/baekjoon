import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {	
	
	static LinkedList<Integer> deque = new LinkedList<>();
	static int count = 0;
	static int[] ar;
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int location = sc.nextInt();
		
		ar = new int[location];

		for(int i = 1;i<=n;i++) {
			deque.add(i);
		}
				
		for(int i=0;i<location;i++) {
			ar[i] = sc.nextInt();
		}
		
		for(int i=0;i<location;i++) {
			move(ar[i]);
		}
		System.out.println(count);
	}
	
	
	static void move(int k) {
		int index = deque.indexOf(k);
		
		int mid;
		
		if(deque.size() % 2 == 0) {
			mid = deque.size() / 2 -1;
		}else {
			mid = deque.size() / 2;
		}
		
		if(index <= mid) {
			for(int i=0;i<index;i++) {
				int first = deque.pollFirst();
				deque.addLast(first);
				count++;
			}
		}
		else {
			for(int i=0;i<deque.size()-index;i++) {
				int back = deque.pollLast();
				deque.addFirst(back);
				count++;
			}
		}
		
		deque.pollFirst();
	}
}