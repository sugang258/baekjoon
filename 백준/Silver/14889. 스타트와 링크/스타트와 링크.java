import java.io.IOException;
import java.util.Scanner;

public class Main {	
	static int n;
	static int[][] ar;
	static boolean[] visit;
	static int result = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		ar = new int[n][n];
		visit = new boolean[n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				ar[i][j] = sc.nextInt();
			}
		}
		
		combination(0, 0);
		System.out.println(result);
	}
	
	//N/2의 경우의 수
	static void combination(int location, int index) {
		
		if(index == n/2) {
			cal();
			return;
		}
		
		for(int i=location;i<n;i++) {
			if(!visit[i]) {
				visit[i] = true;
				combination(i+1, index+1);
				visit[i] = false;
			}
		}
	}
	
	
	//능력치 계산
	static void cal() {
		
		int start =0;
		int link = 0;
		
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(visit[i] == true && visit[j] == true) {
					start += ar[i][j];
					start += ar[j][i];
				}
				
				else if(visit[i] == false && visit[j] == false) {
					link += ar[i][j];
					link += ar[j][i];
				}
			}
		}
		
		int total = Math.abs(start - link);

		result = Math.min(total, result);

	}
	
	
	
}