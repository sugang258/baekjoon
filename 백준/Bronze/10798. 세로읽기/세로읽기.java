import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String[][] str = new String[5][15];
		StringBuilder sb = new StringBuilder();
		
		for(int i =0;i<5;i++) {
			String s = sc.next();
			str[i][0] = s;
			for(int y=0;y<s.length();y++) {
				str[i][y] = Character.toString(s.charAt(y));
			}
		}
		
		for(int i=0;i<15;i++) {
			for(int y=0;y<5;y++) {
				if(str[y][i] == null ) {
					continue;
				}
				sb.append(str[y][i]);
			}
		}
		System.out.println(sb);
		
	}
}
