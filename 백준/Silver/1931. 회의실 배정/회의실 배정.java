import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {	

	static int n;
	static int[][] ar;
	static int count;
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		ar = new int[n][2];
		for(int i=0;i<n;i++) {
			ar[i][0] = sc.nextInt();
			ar[i][1] = sc.nextInt();
		}
		
		sort();
		cal();
		
		System.out.println(count);

	}
	
	static void sort() {
		Arrays.sort(ar,new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}
				return o1[1] - o2[1];
			}
			
		});
	}
	
	static void cal() {
		count = 0;
		int time = 0;
		
		for(int i=0;i<n;i++) {
			if(time <= ar[i][0]) {
				time = ar[i][1];
				count++;
			}
		}
		
	}

}