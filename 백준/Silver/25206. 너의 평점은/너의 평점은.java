import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static double[] s_card = {4.5,4.0,3.5,3.0,2.5,2.0,1.5,1.0,0.0};
	static String[] r_card = {"A+","A0","B+","B0","C+","C0","D+","D0","F"};

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double total=0;
		double s_total=0;
		double pass = 0;
		
		for(int y=0;y<20;y++) {

			double o_score = 0, mul = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			st.nextToken();
			double score = Double.parseDouble(st.nextToken());
			String rank = st.nextToken();
			
			
			for(int i=0;i<s_card.length;i++) {
				if(rank.equals(r_card[i])) {
					o_score = s_card[i];
					mul = score * o_score;
					total+=mul;
					s_total += score;
					pass = total/s_total;
				}
				if(rank.equals("P")) {
					continue;
				}
			}
			
			
		}	
		System.out.printf("%.6f\n",pass);
	}
}
