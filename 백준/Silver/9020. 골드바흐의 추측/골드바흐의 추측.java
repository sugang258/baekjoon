import java.util.Scanner;

public class Main{

   public static boolean[] prime = new boolean[10001];
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        int t = sc.nextInt();
	        get_prime();
	        
	        while(t-- > 0) {
	        	int a = sc.nextInt();
	        	int p = a/2;
	        	int q = a/2;
	        	
	        	while(true) {
	        		if(prime[p]==false && prime[q]==false) {
	        			System.out.println(p +" " + q);
	        			break;
	        		}
	        		p--;
	        		q++;
	        	}
	        	
	        	
	        }
	       
	 }
	 
	 public static void get_prime() {
		 prime[0] = prime[1] = true;
		 
		 for(int i=2; i<=Math.sqrt(prime.length);i++) {
			 if(prime[i]) continue;
			 for(int j=i*i;j<prime.length;j+=i) {
				 prime[j] = true;
			 }
		 }
	 }

}