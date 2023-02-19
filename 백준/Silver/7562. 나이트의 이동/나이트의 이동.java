import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {	
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	
	static int ar[][];
	static boolean check[][];
	
	static int I;
	static Point start, end;
	
	
	public static void main(String[] args) throws IOException {
		
		br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i =0; i < T; i++ ) {
			
			I = Integer.parseInt(br.readLine());
			
			ar = new int[I][I];
			check = new boolean[I][I];
			
			st = new StringTokenizer(br.readLine());
			start = new Point(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),0);
			
			st = new StringTokenizer(br.readLine());
			end = new Point(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),0);
			
			bfs(start);
		}

		
	}
	
	static void bfs(Point p) {
		
		int[][] dir = {{-2,1},{-1,2},{1,2},{2,1},{2,-1},{1,-2},{-1,-2},{-2,-1}};
		
		Queue<Point> queue = new LinkedList<>();
		
		queue.add(p);
		check[p.r][p.c] = true;
		
		while(!queue.isEmpty()) {
			
			Point point = queue.poll();
			
			int pointR = point.r;
			int pointC = point.c;
			int cnt = point.cnt;
			
			if(pointR == end.r && pointC == end.c) {
				System.out.println(point.cnt);
				return;
			}
			
			for(int i=0;i<8;i++) {
				int nr = pointR + dir[i][0];
				int nc = pointC + dir[i][1];
				
				if(nr >= 0 && nr < I && nc >= 0 && nc < I && !check[nr][nc]) {
					queue.add(new Point(nr,nc,cnt+1));
					check[nr][nc] = true;
				}
			}
		}
		
		
	}
	
	static class Point{
		int r,c,cnt;
		
		public Point(int r, int c, int cnt) {
			this.r = r;
			this.c = c;
			this.cnt = cnt;
		}
	}
	
	
}
	