import java.io.*;
import java.util.*;
public class Main{

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken()); // 낮에 올라가는 높이
		int B = Integer.parseInt(st.nextToken()); // 밤에 미끄러지는 높이
		int V = Integer.parseInt(st.nextToken()); // 정상 높이
        
        int day = (V - B) / (A - B);
		if((V - B) % (A - B) != 0){
			day++;
		}
		System.out.println(day);
    }
}