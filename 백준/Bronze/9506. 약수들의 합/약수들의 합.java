import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		while(true) {
			int n = sc.nextInt();
			int total =0;
			
			if(n == -1) {
				break;
			}
			
			int[] ar = new int[n];

			for(int i=1;i<=n;i++) {
				if(n % i == 0 && i != n) {
                    ar[i] = i;
					total += i;
				}
			}
            if(total != n) {
				sb.append( n + " is NOT perfect. \n");
                continue;
			}
			
			if(total == n) {
				sb.append(n + " = 1");

				for(int j=1;j<=n;j++) {
					if(ar[j-1] != 0 && ar[j-1] != 1) {
						sb.append(" + " + ar[j-1]);
					}
				}
				sb.append("\n");
			}
		}
		System.out.println(sb);
	}
}