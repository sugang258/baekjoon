import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main{
    public static void main(String[] args) throws NumberFormatException, IOException {
    	Scanner sc = new Scanner(System.in);
    	
    	int T = sc.nextInt();
    	
    	for(int i=0;i<T;i++) {
        	Map<String, Integer> wear = new HashMap<>();
        	int n = sc.nextInt();
        	
        	while(n-- > 0) {
        		sc.next();
        		String kind = sc.next();
        		
        		if(wear.containsKey(kind)) {
        			wear.put(kind, wear.get(kind)+1);
        		}
        		else {
        			wear.put(kind, 1);
        		}
        	}
        	
        	int result = 1;
        	
        	for(int val : wear.values()) {
        		result *= (val+1);
        	}
        	System.out.println(result - 1);
    	}
    }
}

