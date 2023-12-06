import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        String b = sc.next();
        //최대값 : 6
        //최소값 : 5
        int min = 0,max =0;
        
        if(a.contains("6")) {
        	
        	a = a.replace('6', '5');
        }
        if(b.contains("6")) {
        	b = b.replace('6', '5');
        }

        min = Integer.parseInt(a) + Integer.parseInt(b);
        
        if(a.contains("5")) {
        	a = a.replace('5', '6');
        }
        if(b.contains("5")) {
        	b = b.replace('5', '6');
        }

        max = Integer.parseInt(a) + Integer.parseInt(b);
        	        
        System.out.println(min + " " + max); 
    }
}