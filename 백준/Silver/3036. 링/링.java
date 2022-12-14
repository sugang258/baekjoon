import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class Main{
		
    public static void main(String[] args) throws NumberFormatException, IOException {
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	int ar[] = new int[n];

    	for(int i=0;i<n;i++) {
    		ar[i] = sc.nextInt();
    	}
    	
    	for(int i=1;i<n;i++) {
    		int max = check1(ar[0],ar[i]);
    		int nn = ar[0] / max;
    		int m = ar[i] / max;
    		
    		System.out.println(nn+"/"+m);
    	}

    }
    
    public static int check1(int a,int b) {
    	
    	
    	while(b != 0) {
    		int r = a%b;
    		a = b;
    		b = r;
    	}
    	return a;
    }
}

