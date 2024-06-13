import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String str = br.readLine();
            if(str == null) break;

            StringTokenizer st = new StringTokenizer(str);
            String s = st.nextToken();
            String t = st.nextToken();

            int tmp = 0;

            for (int i = 0; i < t.length(); i++) {
                if(s.charAt(tmp) == t.charAt(i)) {
                    tmp++;
                }
                if(tmp == s.length()) break;
            }
            
            if(tmp == s.length()) {
                System.out.println("Yes");
            }else System.out.println("No");
        }
    }
}
