import java.io.IOException;
import java.util.Scanner;

class Main{
	static int n;
	static int count=0;
	static int a[];
	
    public static void main(String[] args) throws NumberFormatException, IOException {
    	Scanner sc = new Scanner(System.in);
    	
    	n = sc.nextInt();
    	a = new int[n];
    	
    	backtracking(0);
    	
    	System.out.println(count);
    	
    }
    
    public static void backtracking(int index) {
    	
    	if(index == n) {
    		count++;
    		return;
    	}
    	
    	for(int i=0;i<n;i++) {
    		a[index] = i;
    		
    		if(check(index)) {
    			backtracking(index+1);
    		}
    	}
    
    }
    
    public static boolean check(int col) {
    	
    	for(int i=0;i<col;i++) {
    		//같은 행
    		if(a[col] == a[i]) {
    			return false;
    		}
    		//대각선
    		else if(Math.abs(col - i) == Math.abs(a[col] - a[i])) {
    			return false;
    		}
    	}
    	
    	return true;
    }
}

