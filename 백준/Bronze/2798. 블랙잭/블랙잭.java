import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main{
	
	static int[] ar;
	static int n;
	static int m;
	static int result;
	
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine()," ");

    	n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        ar = new int[n];
        
        ar = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        
        for(int i=0;i<n;i++) {
        	bruteForce(ar[i], i+1, 1);	
        }
        System.out.println(result);

    }
    
    public static void bruteForce(int sum, int i, int cnt) {
    	if(cnt == 3 && sum<=m) {
    		result = Math.max(result, sum);
    		return;
    	}
    	if(i==n || cnt ==3) return;
    	for(;i<n;i++) {
    		bruteForce(sum+ar[i], i+1, cnt+1);
    	}
    }
}

