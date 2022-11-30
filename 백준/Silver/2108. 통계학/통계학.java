
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

class Main{
	 public static void main(String[] args) throws NumberFormatException, IOException {
		 
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     int t = Integer.parseInt(br.readLine());
		 int[] array = new int[t];
		 int[] array1 = new int[8001];
		 int total =0;
		 int aver = 0;
		 int many =0;
		 
		 for(int i=0;i<t;i++) {
			 array[i] = Integer.parseInt(br.readLine());
		 }
		 
		 Arrays.sort(array);
		
		 for(int i=0;i<array.length;i++) {
			 total += array[i];
			 array1[array[i]+4000]++;
		 }
		 Arrays.sort(array1);
		// 최빈값
			int[] plus = new int[4002];
			int[] minus = new int[4001];
			for(int i=0;i<t;i++) {
				// 0 ~ 4000 빈도 저장
				if(array[i] <0) {
					minus[Math.abs(array[i])]++;
				}
				
				// -1 ~ -4000 빈도 저장
				else {
					plus[array[i]]++;
				}
			}
			
			ArrayList<Integer> list = new ArrayList<>();
			
			// 가장 높은 빈도수 체크
			int max = 0;
			for(int i=0; i<plus.length;i++) {
				max = Math.max(max, plus[i]);
				
			}
			for(int i=0; i<minus.length;i++) {
				max = Math.max(max, minus[i]);
			}
			
			// 가장 빈도 높은 숫자들 따로 ArrayList에 담기
			for(int i : array) {
				if(i<0) {
					if(minus[Math.abs(i)] == max && !(list.contains(i))) {
						list.add(i);
					}
				}
				else {
					if(plus[i] == max && !(list.contains(i))) {
						list.add(i);
					}
				}
			}
			
			// 2개 이상이면 2번째로 작은 것 출력
			if(list.size()>=2) {
				many = list.get(1);
			}
			// 1개면 그대로
			else {
				many = list.get(0);
			}
		 
		 if((int)Math.round(((double)total /t)) == -0) {
			 aver = 0;
		 }else {
			 aver = (int)Math.round(((double)total /t));
		 }
		 System.out.println(aver);
		 System.out.println(array[array.length/2]);
		 System.out.println(many);
		 System.out.println(array[array.length-1] - array[0]);
	 }
}
