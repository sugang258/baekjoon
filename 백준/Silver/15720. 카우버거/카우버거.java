import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int cnt = Math.min(b,Math.min(c,d));

        Integer[] burger = new Integer[b];
        Integer[] side = new Integer[c];
        Integer[] beverage = new Integer[d];

        int total = 0;
        
        for (int i = 0; i < b; i++) {
            int tmp = sc.nextInt();
            burger[i] = tmp;
            total += tmp;
        }
        Arrays.sort(burger, Collections.reverseOrder());
        for (int i = 0; i < c; i++) {
            int tmp = sc.nextInt();
            side[i] = tmp;
            total += tmp;
        }
        Arrays.sort(side,Collections.reverseOrder());
        for (int i = 0; i < d; i++) {
            int tmp = sc.nextInt();
            beverage[i] = tmp;
            total += tmp;
        }
        Arrays.sort(beverage,Collections.reverseOrder());
        int sale = total;
        for (int i = 0; i < cnt; i++) {
            int tmp = (int)(burger[i] * 0.1 + side[i] * 0.1 + beverage[i] * 0.1);
            sale -= tmp;
        }
        System.out.println(total);
        System.out.println(sale);
    }
}
