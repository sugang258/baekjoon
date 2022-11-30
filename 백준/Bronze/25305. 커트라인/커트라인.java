import java.util.Scanner;
import java.util.Arrays;

public class Main{

    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
	       
	       int n = sc.nextInt();
	       int k = sc.nextInt();
	       int[] array = new int[n];
	       for(int i=0;i<n;i++) {
	    	   int a = sc.nextInt();
	    	   array[i] = a;
	       }
	       Arrays.sort(array);
	       System.out.println(array[n-k]);
    }

}