import java.io.IOException;
import java.util.Scanner;

class Main{
		
    public static void main(String[] args) throws NumberFormatException, IOException {
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();

    	
    	int max = 0;
    	int min = 0;
    	
    	for(int i=0;i<n;i++) {
    		max =0;
    		min = 0;
    		int a = sc.nextInt();
        	int b = sc.nextInt();
        	
        	max = check1(a,b);
        	min = (a*b) / max;

        	System.out.println(min);
        	
    	}


    }
    
    public static int check1(int a,int b) {
    	if(a<b) {
    		int temp = a;
    		a = b;
    		b = temp;
    		
    	}
    	while(b != 0) {
    		int r = a%b;
    		a = b;
    		b = r;
    	}
    	return a;
    }
}

