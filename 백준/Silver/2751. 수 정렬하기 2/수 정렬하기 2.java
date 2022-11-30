import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        
	         StringBuilder sb = new StringBuilder();
		 Scanner sc = new Scanner(System.in);
	       int t = sc.nextInt();
	       List<Integer> ar = new ArrayList<>();

	       for(int i=0;i<t;i++) {
	    	   ar.add(sc.nextInt());
	    	   
	       }
	       Collections.sort(ar);
	       for(int i=0;i<ar.size();i++) {
	    	   sb.append(ar.get(i)).append('\n');
	       }
	       
	       System.out.println(sb);
        
    }

}