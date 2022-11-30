import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Main{
	 public static void main(String[] args) throws NumberFormatException, IOException {
		 
		 Scanner sc = new Scanner(System.in);	     
		 int t = sc.nextInt();
	     
		 int[][] ar = new int[t][2];
		 
		 for(int i=0;i<t;i++) {
			 ar[i][0] = sc.nextInt();
			 ar[i][1] = sc.nextInt();
		 }
		 
		 Arrays.sort(ar, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				if(o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}else {
					return o1[1] - o2[1];
				}
			}
		});
		 
		 for(int i=0;i<t;i++) {
			 System.out.println(ar[i][0] + " " +ar[i][1]);
		 }

	 }
}