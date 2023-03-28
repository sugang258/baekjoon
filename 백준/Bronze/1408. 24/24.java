import java.io.*;
import java.util.*;
 
class time {
    int sec = 0;
    int min = 0;
    int hour = 0;
 
    public time() {
 
    }
 
    public time(int sec, int min, int hour) {
        this.sec = sec;
        this.min = min;
        this.hour = hour;
    }
}
 
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String start = br.readLine();
        String end = br.readLine();
        br.close();
 
        int s = 0, m = 0, h = 0;
 
        StringTokenizer st = new StringTokenizer(start, ":");
        while (st.hasMoreTokens()) {
            s = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
        }
        time C = new time(h, m, s);
 
        st = new StringTokenizer(end, ":");
        while (st.hasMoreTokens()) {
            s = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
        }
        time S = new time(h, m, s);
 
        time R = new time();
        R.sec = S.sec - C.sec;
 
        if (R.sec < 0) {
            R.sec += 60;
            C.min++;
        }
 
        R.min = S.min - C.min;
        if (R.min < 0) {
            R.min += 60;
            C.hour++;
        }
 
        R.hour = S.hour - C.hour;
        if (R.hour < 0) {
            R.hour += 24;
        }
 
        String res = "";
        res = R.hour < 10 ? "0" + R.hour + ":" : R.hour + ":";
 
        res += R.min < 10 ? "0" + R.min + ":" : R.min + ":";
 
        res += R.sec < 10 ? "0" + R.sec : R.sec;
 
        System.out.println(res);
    }
}
