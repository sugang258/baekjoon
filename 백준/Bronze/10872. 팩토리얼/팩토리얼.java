import java.util.Scanner;

class Main{
	 public static void main(String[] args){
		 
		 Scanner sc = new Scanner(System.in);	     
		 int t = sc.nextInt();
	     int total =1;
		 for(int i=1;i<=t;i++) {
			 total *= i;
		 }
		 System.out.println(total);
	 }
}