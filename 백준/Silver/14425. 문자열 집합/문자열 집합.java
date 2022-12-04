import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Main{
		
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
    	int count =0;

        String[] ar =  new String[n];
        String[] arr = new String[m];
        
        for(int i=0;i<n;i++) {
        	ar[i] = br.readLine();
        }
        for(int i=0;i<m;i++) {
        	arr[i] = br.readLine();
        }
        
        for(int i=0;i<n;i++) {
        	for(int j=0;j<m;j++) {
        		if(ar[i].equals(arr[j])) {
        			count++;
        		}
        	}
        }
        System.out.print(count);
    	
    }
    
    
    
}

