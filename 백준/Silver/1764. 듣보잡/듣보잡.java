import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

class Main{
		
    public static void main(String[] args) throws NumberFormatException, IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
        HashSet<String> map = new HashSet<>();
        ArrayList<String> result = new ArrayList<>();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        for(int i=0;i<n;i++) {
        	map.add(br.readLine());
        }
        
        for(int i=0;i<m;i++) {
        	String str = br.readLine();
        	if(map.contains(str)) {
        		result.add(str);
        	}
        }
        
        Collections.sort(result);
        System.out.println(result.size());
        for(String s: result) {
        	System.out.println(s);
        }

    }
    
   
}

