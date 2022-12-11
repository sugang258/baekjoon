import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int area=0;
		StringTokenizer st;
		List<Integer> wh = new ArrayList<Integer>();
		for (int i = 0; i < 6; i++) {
			st = new StringTokenizer(br.readLine());
			st.nextToken();
			wh.add(Integer.parseInt(st.nextToken()));
		}
		
		int newArea = 0;
		for (int i = 0; i < 5; i++) {
			int temp = wh.get(i) * wh.get(i+1);
			if (temp > area) area = temp;
			newArea += temp;
		}
		newArea += wh.get(0) * wh.get(5);
		if (wh.get(0) * wh.get(5) > area) area = wh.get(0) * wh.get(5);
		
		System.out.println(N*(newArea - 2 * area));
	}

}