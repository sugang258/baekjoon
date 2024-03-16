import java.util.Scanner;

public class Main {

    public long Solution(int x, int y) {

        long z =(long) Math.floor((double)y*100 / (double)x);
        int start = 1;
        int end = x;
        long min = -1;

        while(end >= start) {
            int mid = (end+start) / 2 ;
            if( (long)Math.floor((double)(y+mid) *100 / (double)(x+mid)) > z )    {
                min = mid;
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(T.Solution(x,y));
    }
}
