import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
	        int[][] array = new int[100][100];
	        int count =0;
	       int t = sc.nextInt();
	       
	       for(int i=0;i<t;i++) {
	    	   int x = sc.nextInt();
	    	   int y = sc.nextInt();
	    	   
	    	   for(int j=x;j<x+10;j++) {
	    		   for(int k=y;k<y+10;k++) {
	    			  array[j][k] = 1;
	    		   }
	    	   }
	       }
	       
	       for(int i=0;i<100;i++) {
	    	   for(int k=0;k<100;k++) {
	    		   if(array[i][k] == 1) {
	    			   count++;
	    		   }
	    	   }
	       }
	       System.out.println(count);
         
    }

}