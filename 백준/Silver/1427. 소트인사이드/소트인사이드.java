import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main{
	 public static void main(String[] args) throws NumberFormatException, IOException {
		 
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     long n = Long.parseLong(br.readLine());
	     
	     String str = String.valueOf(n);
	     int l = str.length();
	     String[] array = new String[l];
	     
	     for(int i=0;i<l;i++) {
	    	 array[i] = str.substring(i, i+1);
	     }
	     Arrays.sort(array);
	     
	     for(int i=array.length-1;i>=0;i--) {
	    	 System.out.print(array[i]);
	     }
		 
	 }
}