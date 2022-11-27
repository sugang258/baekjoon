import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        
        
        int time = sc.nextInt();
        
        int total = minute + time;
        if(total >= 60) {
            int s = total / 60;
            hour = (hour+s)%24;
            total = total -(s * 60);
        }
        
        System.out.print(hour + " " + total);
        
    }

}