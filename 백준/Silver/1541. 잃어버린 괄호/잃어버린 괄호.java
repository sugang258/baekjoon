import java.io.IOException;
import java.util.Scanner;

public class Main {	

	static String str;
	static String[] sub;
	static int sum = 123456;
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		
		split();
		sum();
        
		System.out.println(sum);

	}
	
	static void split() {
		sub = str.split("-");
	}
	
	static void sum() {
		
		for(int i=0;i<sub.length;i++) {
			int temp = 0;

			String[] hop = sub[i].split("\\+");
			
			for(int j=0;j<hop.length;j++) {
				temp += Integer.parseInt(hop[j]);
			}
			
			if(sum == 123456) {
				sum = temp;
			}else {
				sum -= temp;
			}
		}
	}
}