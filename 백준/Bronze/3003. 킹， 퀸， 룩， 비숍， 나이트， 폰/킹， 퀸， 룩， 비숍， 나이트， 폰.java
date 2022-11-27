import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        
        a = 1 - a;
        b = 1 - b;
        c = 2 - c;
        d = 2 - d;
        e = 2 - e;
        f = 8 - f;
        
        System.out.println(a +" " + b +" " +c +" " +d + " "+ e+ " " + f);
         
    }

}