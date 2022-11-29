import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
	        
	        int n = sc.nextInt();
	        
	        int[] array = new int[n];
	        int count =0;
	        int r = 0;

	        for(int i=0;i<n;i++) {
	        	array[i] = sc.nextInt();
	        }
	        
	        for(int i=0;i<array.length;i++) {
                count = 0;
	        	for(int j=1;j<array[i]+1;j++) {
	        		if(array[i] % j == 0) {
	        			count++;
	        		}
	        		if(count >= 3) {
	        			count=0;
	        			break;
	        		}
	        	}
	        	if(count ==2) {
	        		r++;
	        	}
	        	
	        }
	        System.out.println(r);
    }

}