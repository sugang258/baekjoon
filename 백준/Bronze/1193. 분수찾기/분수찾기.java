import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
	        
	        int a = sc.nextInt();
	        int n = 0;
	        int cnt = 0;
	        int top =1;
	        int bom = 1;
	        if(a == 1) {
	        	System.out.println("1/1");
	        }else {
	        	while(cnt < a) {
	        		n++;
	        		cnt = n*(n+1) /2;
	        	}
	        	int num = a - (n-1)*n/2;
	        	
	        	if(n%2 ==0) {
	        		top = num;
	        		bom = n-num +1;
	        	}else {
	        		top = n-num+1;
	        		bom = num;
	        	}
	        	System.out.println(top+"/"+bom);
	        }
         
    }

}