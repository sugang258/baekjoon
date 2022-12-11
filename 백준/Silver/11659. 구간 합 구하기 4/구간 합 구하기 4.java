import java.io.IOException;
import java.util.Scanner;

class Main{
		
    public static void main(String[] args) throws NumberFormatException, IOException {
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	int m = sc.nextInt();
    	int a[] = new int[n+1];
    	a[0] = 0;
    	for(int i=1;i<=n;i++) {
    		a[i] = a[i-1] + sc.nextInt();
    	}
    	
    	for(int i=0;i<m;i++) {
    		int x = sc.nextInt();
    		int y = sc.nextInt();
    		System.out.println(a[y] - a[x-1]);
    		
    	}

    }
}

