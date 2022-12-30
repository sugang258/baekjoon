import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
	static int n,m;
	static int a[];
	static StringBuilder sb = new StringBuilder();
	
    public static void main(String[] args) throws NumberFormatException, IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
    	
    	a = new int[m];
    	
    	backtracking(0);
    	System.out.println(sb);
    
    	
    }
    
    public static void backtracking(int index) {
    	if(index == m) {
    		for(int i=0;i<m;i++) {
    			sb.append(a[i]).append(" ");
    		}
    		sb.append('\n');
    		return;
    	}
    	
    	for(int i=1;i<=n;i++) {
    		a[index] = i;
    		backtracking(index+1);
    	}
    }
    

}

