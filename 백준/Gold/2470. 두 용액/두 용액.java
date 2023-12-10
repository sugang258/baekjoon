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
        
        ArrayList<Integer> ar = new ArrayList<>(); //산성
        st = new StringTokenizer(br.readLine());


        for(int i=0;i<n;i++) {
        	int a = Integer.parseInt(st.nextToken());
        	ar.add(a);
        }
        
        Collections.sort(ar);
       
        int min = Integer.MAX_VALUE;
        int a = 0;
        int b = 0;
        
        int i = 0;
        int j = ar.size()-1;
        
        while(i < j) {
        	int a1 = ar.get(i);
        	int b1 = ar.get(j);
        	int sum = a1+b1;
        	
        	if(Math.abs(sum) < min) {
    			min = Math.abs(sum);
    			a = a1;
    			b = b1;
    			
    		}
        	if(sum > 0) {
        		j--;
        	}else {
        		i++;
        	}
        }
        
        System.out.println(a + " " + b);
        
    }

}