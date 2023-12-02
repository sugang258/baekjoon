import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine();
		String[] ar = new String[s.length()];
		
		for(int i=0;i<s.length();i++) {
			ar[i] = s.substring(i,i+1);
		}
		
		if(three(ar) && ten(ar)) {
			Arrays.sort(ar, Collections.reverseOrder());
			for(int i=0;i<ar.length;i++) {
				sb.append(ar[i]);
			}
		}
		else {
			sb.append(-1);
		}
		
		System.out.println(sb);
	}
	
	//3의 배수
	static boolean three(String[] ar) {
		
		int sum = 0;
		for(int i=0;i<ar.length;i++) {
			sum += Integer.parseInt(ar[i]);
		}
		if(sum % 3 == 0) {
			return true;
		}
		return false;
	}
	
	//10의 배수
	static boolean ten(String[] ar) {
		
		for(int i=0;i<ar.length;i++) {

			if(ar[i].equals("0")) {
				return true;
			}
		}

		return false;
	}
}