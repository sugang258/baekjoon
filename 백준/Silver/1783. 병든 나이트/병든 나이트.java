import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int answer = 0;

        if(n == 1) {
            answer = 1;
        }else if(n == 2) {
            answer = Math.min((m+1)/2, 4);
        }else if(n >= 3) {
            if(m < 7) {
                answer = Math.min(m,4);
            }else{
                answer = m-2;
            }
        }
        System.out.println(answer);
    }
}
