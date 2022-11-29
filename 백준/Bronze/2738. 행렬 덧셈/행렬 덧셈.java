import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int m = sc.nextInt();
	        
	        int[][] array1 = new int[n][m];
	        int[][] array2 = new int[n][m];
	        
	        for(int i=0;i<n;i++) {
	        	for(int j=0;j<m;j++) {
		        	int a = sc.nextInt();
		        	array1[i][j] = a;
	        	}
	        }
	        
	        for(int i=0;i<n;i++) {
	        	for(int j=0;j<m;j++) {
		        	int a = sc.nextInt();
		        	array2[i][j] = a;
	        	}
	        }
	        
	        int[][] array3 = new int[n][m];
	        for(int i=0;i<n;i++) {
	        	for(int j=0;j<m;j++) {
	        		array3[i][j] = array1[i][j] + array2[i][j];
	        		System.out.print(array3[i][j] + " ");
	        		if(j == m-1) {
	        			System.out.println();
	        		}
	        	}
    }
    }
}