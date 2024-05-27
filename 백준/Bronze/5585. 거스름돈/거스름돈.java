import java.util.Scanner;

public class Main {

    public int Solution(int money) {
        int cnt = 0;
        int[] charge = {500,100,50,10,5,1};

        int tmp = 0;
        while(money > 0) {
            if(money >= charge[tmp]) {
                cnt += (money / charge[tmp]);
                money = (money % charge[tmp]);
            }
            tmp++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int money = sc.nextInt();

        System.out.println(T.Solution(1000- money));
    }
}
