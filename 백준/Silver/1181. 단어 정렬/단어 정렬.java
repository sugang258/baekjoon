import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Main{
	 public static void main(String[] args) throws NumberFormatException, IOException {
		 
		 Scanner sc = new Scanner(System.in);	     
		 int t = sc.nextInt();
	     
		 String[] ar= new String[t];
		 
		 for(int i=0;i<t;i++) {
			 ar[i] = sc.next();
		 }
		 
		 Arrays.sort(ar, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				if(o1.length() == o2.length()) {
					return o1.compareTo(o2);
				}else {
					return o1.length()-o2.length();
				}
			}
		});
		 
		 System.out.println(ar[0]);
		 
		 for(int i=1;i<t;i++) {
			 if(!ar[i].equals(ar[i-1])) {
				 System.out.println(ar[i]);
			 }
		 }

	 }
}