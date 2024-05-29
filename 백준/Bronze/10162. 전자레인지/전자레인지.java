import java.util.Scanner;

public class Main {

    static int[] time = {300, 60, 10};
    static int[] count = new int[3];

    public void Solution(int n) {

        for (int i = 0; i < 3; i++) {
            if(n >= time[i]) {
                count[i] = n / time[i];
                n = n % time[i];
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n % 10 != 0) System.out.println(-1);
        else{
            T.Solution(n);
            for (int i : count) {
                System.out.print(i + " ");
            }
        }
    }
}
