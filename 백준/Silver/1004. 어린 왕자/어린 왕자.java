import java.io.IOException;
import java.util.Scanner;

class Main{
		
    public static void main(String[] args) throws NumberFormatException, IOException {
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	int x1, y1,x2,y2;
    	int count=0;

    	
    	for(int i=0;i<n;i++) {
    		count=0;

    		x1 = sc.nextInt();
    		y1 = sc.nextInt();
    		x2 = sc.nextInt();
    		y2 = sc.nextInt();
    		
    		int a = sc.nextInt();
    		
    		for(int j=0;j<a;j++) {
    			boolean check1 = false;
        		boolean check2 = false;
    			int x = sc.nextInt();
    			int y = sc.nextInt();
    			int r = sc.nextInt();
    			
    			
    			check1 = check(x1,y1,x,y,r);
    			check2 = check(x2,y2,x,y,r);
    			
    			if(check1 == true && check2 == false) count++;
    			else if(check1 == false && check2 == true) count++;
    		}
    		
			System.out.println(count);

   
    }
    	
    	
   
    	
	}
    public static boolean check(int x1,int y1,int x2,int y2,int r) {
    	if(Math.pow(r, 2) < Math.pow(x1-x2, 2) + Math.pow(y1 - y2, 2)) {
    		return true;
    	}
    	return false;
    }
}

