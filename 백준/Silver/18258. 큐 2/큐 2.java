import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {	
	
	static Queue<Integer> queue = new LinkedList<>();
	static int back = 0;
	static StringBuffer sb = new StringBuffer();

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++) {
			String str = br.readLine();
			run(str);
		}
		System.out.println(sb);
	}
	
	
	static void run(String str) {
		
		
		
		if(str.contains("push")) {
			String spt[] = str.split(" ");
			queue.add(Integer.parseInt(spt[1]));
			back = Integer.parseInt(spt[1]);
		}
		else if(str.equals("pop")) {
			if(queue.isEmpty()) {
				sb.append("-1").append("\n");
			}else {
				sb.append(queue.poll()).append("\n");
			}
		}
		else if(str.equals("size")) {
			sb.append(queue.size()).append("\n");
		}
		else if(str.equals("empty")) {
			if(queue.isEmpty()) {
				sb.append("1").append("\n");
			}else {
				sb.append("0").append("\n");
			}
		}
		else if(str.equals("front")) {
			if(queue.isEmpty()) {
				sb.append("-1").append("\n");
			}else {
				sb.append(queue.peek()).append("\n");
				
			}
		}
		else if(str.equals("back")) {
			if(queue.isEmpty()) {
				sb.append("-1").append("\n");
			}else {
				sb.append(back).append("\n");
			}
		}
	
	
	}
}