import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long n=0L;
       
        if (b >= c) {
            n = -1L;
        }else{
            n = a /(c-b) +1;
        }
        
        
        
        System.out.println(n);
         
    }

}