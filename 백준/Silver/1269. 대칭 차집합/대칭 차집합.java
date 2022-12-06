import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

class Main{
		
    public static void main(String[] args) throws NumberFormatException, IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
     
        for(int i=0;i<n;i++) {
        	set1.add(Integer.parseInt(st.nextToken()));
        }
        
        st = new StringTokenizer(br.readLine());
        
        for(int i=0;i<m;i++) {
        	set2.add(Integer.parseInt(st.nextToken()));
        }
        
        int count=0;
        for(int i : set2) {
        	if(!set1.contains(i)){
        		count++;
        	}
        }
        
        for(int j : set1) {
        	if(!set2.contains(j)) {
        		count++;
        	}
        }
        
        System.out.println(count);
        
        

    }
    
   
}

