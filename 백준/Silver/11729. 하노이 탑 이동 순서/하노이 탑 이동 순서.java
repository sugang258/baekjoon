import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
	
	public static StringBuilder sb = new StringBuilder();
	
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int n = Integer.parseInt(br.readLine());
    	
    	sb.append((int) Math.pow(2, n)-1).append('\n');
    	hanoi(n,1,3,2);
    	System.out.println(sb);

    	
    }
    
    public static void hanoi(int n, int start ,int end, int sub) {
    	if(n ==1) {
    		sb.append(start + " " + end + "\n");
    		return;
    	}
    	
    	hanoi(n-1, start, sub, end);
    	sb.append(start + " " + end + "\n");
    	hanoi(n-1, sub,end,start);
    }
}

