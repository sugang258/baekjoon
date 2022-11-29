import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
	        
	        int[][] array = new int[9][9];
	        int n =0;
	        int m = 0;
	        int max = array[0][0];
	        
	        for(int i=0;i<9;i++) {
	        	for(int j=0;j<9;j++) {
	        		int a = sc.nextInt();
	        		array[i][j] = a;
	        	}
	        }
	        
	        for(int i=0;i<9;i++) {
	        	for(int j=0;j<9;j++) {
	        		if(array[i][j] >= max) {
	        			max = array[i][j];
	        			n = i;
	        			m = j;
	        			
	        		}
	        	}
	        }
	        System.out.println(max);
	        System.out.println((n+1) + " " + (m+1));
         
    }

}