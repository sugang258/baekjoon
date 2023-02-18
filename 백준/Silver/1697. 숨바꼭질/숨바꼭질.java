import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {	
	
	static int[] check;
	static int N,K;
	
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		K = sc.nextInt();
		
		check = new int[100001];
		
		System.out.println(bfs(N));
	}
	
	static int bfs(int x) {
		
		Queue<Integer> queue = new LinkedList<>();
		
		queue.add(x);
		int next = x;
		int n = 0;
		check[next] = 1;
		
		while(!queue.isEmpty()) {
			n = queue.remove();
			
			if(n == K) {
				return check[n]-1;
			}
			if(n-1 >= 0 && check[n-1] == 0) {
				check[n-1] = check[n]+1;
				queue.add(n-1);
			}
			if(n+1 <= 100000 && check[n+1] == 0) {
				check[n+1] = check[n]+1;
				queue.add(n+1);
			}
			if(n*2 <= 100000 && check[n*2] == 0) {
				check[n*2] = check[n] + 1;
				queue.add(n*2);
			}
		}
		return -1;
	}
}
	