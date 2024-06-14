import java.util.*;

class time implements Comparable<time> {
    int start;
    int end;

    public time(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(time o) {
        return this.start - o.start;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<time> ar = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ar.add(new time(sc.nextInt(),sc.nextInt()));
        }
        Collections.sort(ar);

        int answer = ar.get(0).start + ar.get(0).end;

        for (int i = 1; i < n; i++) {
            time time = ar.get(i);
            if(time.start >= answer) answer = time.start+ time.end;
            else answer += time.end;
        }
        System.out.println(answer);
    }
}
