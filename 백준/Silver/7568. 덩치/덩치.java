import java.util.Scanner;

class Main{
	
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	int[][] ar = new int[n][2];
    	
    	for(int i=0;i<n;i++) {
    		ar[i][0] = sc.nextInt();
    		ar[i][1] = sc.nextInt();
    	}
    	
    	for(int i=0;i<n;i++) {
    		int rank = 1;
    		
    		for(int j=0;j<n;j++) {
    			if(i == j) continue;
    			
    			if(ar[i][0] < ar[j][0] && ar[i][1] < ar[j][1]) {
    				rank++;
    			}
    		}
    		System.out.print(rank + " ");
    		
    	}

    }
}

