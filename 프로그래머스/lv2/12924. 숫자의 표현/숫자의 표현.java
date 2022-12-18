class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = 1; // 수열의 크기
        n--;
        while (n > 0) {
            cnt++;
            n = n - cnt;
            if (n % cnt == 0) {
                answer++;
                System.out.println(n);
                System.out.println(cnt);

                
            }
        }
        return answer+1;
    }
}