import java.io.IOException;
import java.util.Scanner;

class Main{
    public static void main(String[] args) throws NumberFormatException, IOException {
    	Scanner sc = new Scanner(System.in);
    	
    	int num = sc.nextInt();
    	int count = 0;
    	
    	while(num >= 5) {
    		count += num/5;
    		num /= 5;
    	}
    	System.out.println(count);
    }
}

