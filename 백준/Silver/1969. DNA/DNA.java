import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Map<Character,Integer> map;
        int n = sc.nextInt();
        int m = sc.nextInt();

        String[] ar = new String[n];
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            ar[i] = str;
        }
        int cnt = 0;
        for (int i = 0; i < m; i++) {
            map = new HashMap<>();
            int max = 0;
            char c = ' ';
            for (int j = 0; j < n; j++) {
                map.put(ar[j].charAt(i),map.getOrDefault(ar[j].charAt(i),0)+1);
            }
            for(char key : map.keySet()) {
                if(map.get(key) > max) {
                    max = map.get(key);
                    c = key;
                }
                else if(max == map.get(key)) {
                    char temp = key;
                    int n1 = Character.getNumericValue(c);
                    int n2 = Character.getNumericValue(temp);

                    if(n1 > n2) {
                        c = temp;
                    }
                }
            }
            cnt += n-max;
            sb.append(c);
        }
        System.out.println(sb);
        System.out.println(cnt);
    }
}
