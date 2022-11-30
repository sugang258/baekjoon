import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

        public static void main(String[] args) throws NumberFormatException, IOException {
		 
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     int t = Integer.parseInt(br.readLine());
		 int[] array = new int[10001];
		 
		 for(int i=0;i<t;i++) {
			 array[Integer.parseInt(br.readLine())]++;
		 }
		 
		 StringBuilder sb = new StringBuilder();
		 
		 for(int i=1;i<10001;i++) {
			 while(array[i]>0) {
				 sb.append(i).append('\n');
				 array[i]--;
			 }
		 }
		 System.out.println(sb); 
    }

}