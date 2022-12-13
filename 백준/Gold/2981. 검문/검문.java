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
		Arrays.sort(ar);
		
		int value = ar[1] - ar[0];
		
		for(int i=2;i<n;i++) {
			value = check1(value, ar[i]-ar[i-1]);
		}
		
		for(int i=2;i<=value;i++) {
			if(value % i == 0) {
				System.out.print(i + " ");
			}
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

