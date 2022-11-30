import java.util.Scanner;
import java.util.Arrays;

public class Main{

    public static void main(String[] args) {

        
	        Scanner sc = new Scanner(System.in);
	        int count =0;
	       int t = sc.nextInt();
	        int[] array = new int[t];

	       for(int i=0;i<t;i++) {
	    	   int a = sc.nextInt();
	    	   array[i] = a;
	    	   
	       }
	       Arrays.sort(array);
	       for(int i=0;i<array.length;i++) {
	    	   System.out.println(array[i]);
	       }
    }

}