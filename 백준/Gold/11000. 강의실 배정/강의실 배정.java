import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        List<Class> schedule = new ArrayList<>();
        
        for(int i=0;i<n;i++) {
        	st = new StringTokenizer(br.readLine());
        	int start = Integer.parseInt(st.nextToken());
        	int end = Integer.parseInt(st.nextToken());
        	
        	schedule.add(new Class(start,end));
        }
        
        Collections.sort(schedule);
        
        Queue<Integer> queue = new PriorityQueue<>();
        
        int time = 0;
        for(Class c : schedule) {
        	time = c.end;
        	
        	if(!queue.isEmpty() && queue.peek() <= c.start) {
        		queue.poll();
        	}
        	
        	queue.add(time);
        }
        
        System.out.println(queue.size());
    }
    
    static class Class implements Comparable<Class> {
    	int start;
    	int end;
    	
    	public Class(int start, int end) {
    		this.start = start;
    		this.end = end;
    	}

		@Override
		public int compareTo(Class o) {
			// TODO Auto-generated method stub
			return this.start == o.start ? this.end - o.end : this.start - o.start;
		}
    }
}