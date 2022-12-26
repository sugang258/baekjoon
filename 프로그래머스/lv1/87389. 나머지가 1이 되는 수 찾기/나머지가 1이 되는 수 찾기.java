class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=n;i>0;i--){
            if(n % i == 1){
                System.out.println("yes");
                answer = i;
            }
        }
        return answer;
        
        
    }
}