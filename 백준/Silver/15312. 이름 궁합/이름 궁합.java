import java.util.Scanner;

public class Main {

    static int[] alpabet = {3,2,1,2,3,3,2,3,3,2,2,1,2,2,1,2,2,2,1,2,1,1,1,2,2,1};
    static int[] ar;

    public static String Solution() {
        int size = ar.length;
        while(size > 2) {
            for (int i = 0; i < size-1; i++) {
                ar[i] = (ar[i] + ar[i+1]) % 10;
            }
            ar[--size] = 0;
        }
        return String.valueOf(ar[0]) + String.valueOf(ar[1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a_name = sc.next();
        String b_name = sc.next();

        ar = new int[a_name.length() + b_name.length()];

        for (int i = 0; i < ar.length; i = i+2) {
            ar[i] = alpabet[a_name.charAt(i/2)-65];
            ar[i+1] = alpabet[b_name.charAt(i/2)-65];
        }
        System.out.println(Solution());
    }
}
