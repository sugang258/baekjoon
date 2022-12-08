import java.io.IOException;
import java.util.Scanner;

class Main{
		
    public static void main(String[] args) throws NumberFormatException, IOException {
    	Scanner sc = new Scanner(System.in);
    	while(true) {
        	int x = sc.nextInt();
        	int y = sc.nextInt();
        	int w = sc.nextInt();
        	
        	if(x == 0 && y == 0 && w==0) break;
        	
        	if((x*x) + (y*y) == (w*w)) {
        		System.out.println("right");
        	}else if((y*y) + (w*w) == (x*x)) {
        		System.out.println("right");

        	}else if((x*x) + (w*w) == (y*y)) {
        		System.out.println("right");

        	}
        	else {
        		System.out.println("wrong");
        	}
        }
    }
}

