import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main{
		
    public static void main(String[] args) throws NumberFormatException, IOException {
    	Scanner sc = new Scanner(System.in);
    	List<Integer> ar = new ArrayList<>();
    	int n = sc.nextInt();
    	
    	for(int i=0;i<n;i++) {
    		ar.add(sc.nextInt());
    	}
    	Collections.sort(ar);
    	
    	System.out.println(ar.get(0) * ar.get(n-1));
    	
    	
    }
}

