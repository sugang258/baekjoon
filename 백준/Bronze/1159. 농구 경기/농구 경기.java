import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		char[] arr = new char[N];
		String result = "";
		
		//입력값의 0인덱스 값만 배열에 저장
		for(int i = 0; i < N; i++) {
			arr[i] = (br.readLine()).charAt(0);
		}
		
		//정렬
		Arrays.sort(arr);
		
		for(int i = 0; i < (N - 1); i++) {
			int count = 0;
			for(int j = (i + 1); j < N; j++) {
				//배열의 값이 같고, 비교 값이 0이 아니면 count에 +1.
				if(arr[i] == arr[j] && arr[i] != '0') {
					count++;
					arr[j] = '0';
				}
			}
			//5개 이상인데, 비교하게 되면 같은 횟수가 4이면 5개가 같은 것이다.
			if(count > 3) {
				result += arr[i];
			}
		}
		if(result.equals("")) {
			System.out.println("PREDAJA");
		}else {
			System.out.println(result);
		}
	}

}