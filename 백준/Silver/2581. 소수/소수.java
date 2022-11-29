import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
	        
	        int min = sc.nextInt();
	        int max = sc.nextInt();
	        
	        int count =0;
	        int total =0;
	        int mm = Integer.MAX_VALUE;

	        
	        for(int i=min;i<max+1;i++) {
	        	count = 0;
	        	for(int j=1;j<i+1;j++) {
	        		if(i % j == 0) {
	        			count++;
	        		}
	        		if(count >= 3) {
	        			count=0;
	        			break;
	        		}
	        	}
	        	if(count ==2) {
	        		total += i;
	        		if(mm == Integer.MAX_VALUE ) {
	        			mm = i;
	        		}
	        	}
	        	
	        }

	        
	        if(total == 0) {
	        	System.out.println(-1);
	        }else {
	        	System.out.println(total);
		        System.out.println(mm);
	        }

    }

}