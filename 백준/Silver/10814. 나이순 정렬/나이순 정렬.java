import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Main{
	 public static void main(String[] args) throws NumberFormatException, IOException {
		 
		 Scanner sc = new Scanner(System.in);	     
		 int t = sc.nextInt();
	     String[][] array = new String[t][2];
	     
	     for(int i=0;i<t;i++) {
	    	 array[i][0] = sc.next();
	    	 array[i][1] = sc.next();
	     }
	     
	     Arrays.sort(array,new Comparator<String[]>() {

			@Override
			public int compare(String[] o1, String[] o2) {
				// TODO Auto-generated method stub
				return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
			}
		});
	     
	     for(int i=0;i<t;i++) {
	    	 System.out.println(array[i][0] +" " + array[i][1]);
	     }

	 }
}
