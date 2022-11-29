import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
	        
	        int a = sc.nextInt();
	        int result =0;
	        if(a == 4 || a == 7) {
	        	result = -1;
	        }else if(a %5 == 0) {
	        	result = a/5;
	        }
	        else if((a%5 == 1) || (a%5 == 3)) {
	        	result = (a/5) + 1;
	        }else if((a%5 == 2) || (a%5 == 4) ) {
	        	result = (a/5) + 2;
	        }
	        
	        System.out.println(result);
	         
	    }

}
