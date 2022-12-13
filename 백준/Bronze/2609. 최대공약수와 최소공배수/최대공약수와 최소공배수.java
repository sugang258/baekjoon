import java.io.IOException;
import java.util.Scanner;

class Main{
		
    public static void main(String[] args) throws NumberFormatException, IOException {
    	Scanner sc = new Scanner(System.in);
    	
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	
    	int max = 0;
    	int min = 0;
    	
    	for(int i=1;i<=a && i<=b;i++) {
    		if(a % i ==0 && b % i == 0) {
    			max = i;
    		}
    	}
    	min = (a * b) /max;
    	
    	System.out.println(max);
    	System.out.println(min);

    }
}
