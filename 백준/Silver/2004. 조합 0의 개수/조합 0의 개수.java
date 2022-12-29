import java.io.IOException;
import java.util.Scanner;

class Main{
    public static void main(String[] args) throws NumberFormatException, IOException {
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	int m = sc.nextInt();
    	
    	long five = five(n) - five(n-m) - five(m);
    	long two = two(n) - two(n-m) - two(m);
    	
    	System.out.println(Math.min(five, two));
    	
    }
    
    static long five(long num) {
    	int count = 0;
    	
    	while(num >=5) {
    		count += num/5;
    		num /= 5;
    	}
    	return count;
    }
    static long two(long num){
    	int count =0;
    	
    	while(num >= 2) {
    		count += num/2;
    		num/=2;
    	}
    	return count;
    }
}

