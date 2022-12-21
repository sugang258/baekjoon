import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;
        int count = 0;
    
        for(int i=1;i<=n*i;i++) {
            
            if(n % 2 == 0) {
                n = n/2;
              
            }else{
                n = n - 1;
                ans++;
            }
            
            if(n == 1) {
                ans++;
                break;
            }
            
        }
        

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        //System.out.println("Hello Java");

        return ans;
    }
}