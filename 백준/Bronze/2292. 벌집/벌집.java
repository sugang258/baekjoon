import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int id = sc.nextInt();
        
        int count = 1;
        int range = 2;
        
        if(id == 1) {
            System.out.println(1);
        }else{
            while(range <=id){
                range = range + (count*6);
                count++;
            }
            System.out.println(count);
        }
         
    }

}