class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
    
            answer[0] =x;
            for(int i=0;i<n-1;i++){
                answer[i+1] = answer[i]+x;
            }
        
        return answer;
    }
}