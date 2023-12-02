import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int count=0;
		
		while(true) {
			if(b % 2 == 0 ) {
				b = b / 2;
				count++;
			}
			else if(b % 10 != 1 ) {
				count = -2;
				break;
			}
			else if(b % 2 == 1) {
				String s = String.valueOf(b);
				b = Integer.parseInt(s.substring(0, s.length()-1));
				count++;
			}
			
			if(b < a) {
				count = -2;
				break;
			}
			if(b == a) {
				break;
			}
		}
		System.out.println(count+1);
	}
}