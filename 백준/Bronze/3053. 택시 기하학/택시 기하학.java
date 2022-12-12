import java.io.IOException;
import java.util.Scanner;

class Main{
		
    public static void main(String[] args) throws NumberFormatException, IOException {
    	Scanner sc = new Scanner(System.in);
    	
    	double r = sc.nextInt();
    	
    	System.out.println(r * r* Math.PI);
    	System.out.println(2 * r * r);

    }
}

