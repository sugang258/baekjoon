import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

class Main{
	 public static void main(String[] args) throws NumberFormatException, IOException {
		 
		 Scanner sc = new Scanner(System.in);	     
		 int t = sc.nextInt();
	     
		 int[] ar = new int[t];
		 int[] sorted = new int[t];
		 HashMap<Integer, Integer> rankingMap = new HashMap<Integer, Integer>();
		 
		 for(int i=0;i<t;i++) {
			sorted[i] = ar[i] = sc.nextInt();
		 }
		 
		 Arrays.sort(sorted);
		 
		int rank=0;
		for(int v : sorted) {
			if(!rankingMap.containsKey(v)) {
				rankingMap.put(v, rank);
				rank++;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int key : ar) {
			int ranking = rankingMap.get(key);
			sb.append(ranking).append(' ');
		}
		System.out.println(sb);
		
	 }
}
