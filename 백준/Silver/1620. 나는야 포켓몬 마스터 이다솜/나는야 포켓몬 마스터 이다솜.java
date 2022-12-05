import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.regex.Pattern;


class Main{
		
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
    	
        Map<Integer, String> map = new HashMap<>();
        Map<String, Integer> map1 = new HashMap<>();
        
        for(int i=0;i<n;i++) {	
        	String str = br.readLine();
        	map.put(i, str);
        	map1.put(str, i);
        }

        for(int i=0;i<m;i++) {
        	String str = br.readLine();
        	if(isNumberic(str)) {
        		int a = Integer.parseInt(str);
        		System.out.println(map.get(a-1));
        	}else {
        		System.out.println(map1.get(str)+1);
        	}
        }
    }
    
    public static boolean isNumberic(String str) {
    	return Pattern.matches("^[0-9]*$", str);
    }
    
    
    
}

