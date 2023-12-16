import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        
        ArrayList<Integer> ar = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {
        	ar.add(Integer.parseInt(st.nextToken()));
        	
        }
        Collections.sort(ar);
        int X = Integer.parseInt(br.readLine());
        // 1 2 3 5 7 9 10 11 12
       
        int count = 0;
        
        int start =0;
        int end = n-1;
        int num = 0;
        
        while(start < end) {
        	num = X - ar.get(start);
        	
        	if(ar.get(end) == num) {
        		count++;
        	}
        	if(num <= ar.get(end)) {
        		end--;
        	}
        	else {
        		start++;
        	}
        }
        
        System.out.println(count);
        
    }

}