import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	static String[] ch = {"0","1","2","3","4","5","6","7","8","9","A",
			"B","C","D","E","F","G","H","I","J","K","L",
			"M","N","O","P","Q","R","S","T","U","V","W",
			"X","Y","Z"};
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String[] st = s.split("");

		int n = sc.nextInt();
		int answer = 0;
		
		for(int i=0;i<st.length;i++) {
			for(int j=0;j<n;j++) {
				if(st[i].equals(ch[j])) {
					answer += j * Math.pow(n, st.length-(i+1));
				}
			}
		}
		
		System.out.println(answer);

	}
}
