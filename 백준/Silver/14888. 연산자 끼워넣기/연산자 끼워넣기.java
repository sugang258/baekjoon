import java.io.IOException;
import java.util.Scanner;

public class Main {	
	static int n;
	static int[] ar;
	static int[] operator = new int[4];
	static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		ar = new int[n];
		for(int i=0;i<n;i++) {
			ar[i] = sc.nextInt();
		}
		for(int i=0;i<4;i++) {
			operator[i] = sc.nextInt();
		}
		
		back(ar[0],1);
		System.out.println(max);
		System.out.println(min);
	}
	
	static void back(int number, int index) {
		
		if(index == n) {
			max = Math.max(max, number);
			min = Math.min(min, number);
			return;
		}
		
		for(int i=0;i<4;i++) {
			if(operator[i] > 0) {
				operator[i]--;
				
				if(i == 0) {
					back(number+ar[index],index+1);
				}else if(i == 1) {
					back(number-ar[index],index+1);
				}else if(i == 2) {
					back(number*ar[index],index+1);
				}else {
					back(number/ar[index],index+1);
				}
				
//				switch(i) {
//				
//				case 0: back(number + ar[index], index+1); break;
//				case 1: back(number - ar[index], index+1); break;
//				case 2: back(number * ar[index], index+1); break;
//				case 3: back(number / ar[index], index+1); break;
//				}
				
				operator[i]++;
			}
		}
		
	}

}