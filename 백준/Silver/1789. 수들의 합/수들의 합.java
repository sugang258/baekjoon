import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();
        long num = 0;
        long count = 0;
        for(int i=1;;i++){
            if(num > number){
                    break;
                }    
     
                num += i;
                count++;
               
        }

        System.out.println(count-1);
    }
}