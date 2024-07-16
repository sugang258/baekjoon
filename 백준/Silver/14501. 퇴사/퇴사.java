import java.util.ArrayList;
import java.util.Scanner;

class work {
    public int time;
    public int price;

    public work(int time, int price) {
        this.time = time;
        this.price = price;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dy = new int[n+1];
        ArrayList<work> ar = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            ar.add(new work(a,b));
        }
        for (int i = 0; i < n; i++) {
            work w = ar.get(i);
            if(i + w.time <= n) {
                dy[i + w.time] = Math.max(dy[i+w.time], dy[i] + w.price);
            }
            dy[i+1] = Math.max(dy[i+1], dy[i]);
        }
        System.out.println(dy[n]);
    }
}
