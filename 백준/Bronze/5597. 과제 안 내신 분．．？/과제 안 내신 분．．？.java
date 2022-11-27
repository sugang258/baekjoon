import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] ar = new int[31];
        
        for(int i=1;i<29;i++) {
            int a = sc.nextInt();
            ar[a] = 1;
        }
        
        for(int i=1;i<ar.length;i++) {
            if(ar[i] != 1) {
                System.out.println(i);
            }
        }
       
    }

}