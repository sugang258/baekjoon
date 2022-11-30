import java.util.Scanner;
import java.util.Arrays;

public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
	       
	        int[] array = new int[5];
	        int total =0;
	        for(int i=0;i<5;i++) {
	        	int a = sc.nextInt();
	        	array[i] = a;
	        }

	       Arrays.sort(array);
	       for(int i=0;i<array.length;i++) {
	    	   total += array[i];
	       }
	       System.out.println(total/5);
	       System.out.println(array[2]);
         
    }

}