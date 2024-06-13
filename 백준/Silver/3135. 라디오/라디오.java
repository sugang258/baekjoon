import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int n = sc.nextInt();
        int tmp = Math.abs(a-b);
        int temp = 0;

        int answer = 0;

        for (int i = 0; i < n; i++) {
            int channel = sc.nextInt();
            if(b == channel) {
                System.out.println(1);
                return;
            }
            else{
                if(Math.abs(channel - b) < tmp) {
                    tmp = Math.abs(channel-b);
                    temp = channel;
                }
            }

        }
        if(tmp != Math.abs(a-b)) {
            answer += Math.abs(temp - b) + 1;
        }
        else answer = tmp;
        
        System.out.println(answer);
    }
}
