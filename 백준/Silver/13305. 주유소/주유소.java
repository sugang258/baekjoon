import java.io.IOException;
import java.util.Scanner;

public class Main {	

	static long[] distance;
	static long[] cost;
	static int n;
	static long total;
	static long min;
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		
		distance = new long[n-1];
		cost = new long[n];
		
		for(int i=0;i<n-1;i++) {
			distance[i] = sc.nextLong();
		}
		
		for(int i=0;i<n;i++) {
			cost[i] = sc.nextLong();
		}
		min = cost[0];
		cal(0);
		System.out.println(total);

		

	}
	
	static void cal(long a) {
		
		//자기보다 낮은 가격 탐색
		for(int i=0;i<n-1;i++) {
			if(cost[i] < min) {
				min = cost[i];
			}
			total += min *distance[i];
		}
	}
}