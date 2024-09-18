import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int K = sc.nextInt();

        int count = 0;

        while(K > A) {
            if(K == A) {
                break;
            }
            if(K % 2 == 0 && K / 2 >= A) {
                K = K / 2;
            }
            else K = K - 1;
            count++;
        }
        System.out.println(count);
    }
}
