class Solution {
    public int solution(int n) {
        int answer = 0;
        Double ss = Math.sqrt(n);
        System.out.println(ss);
        if(ss == ss.intValue()) {
             answer=1;
         }else{
             answer=2;
         }
        return answer;
    }
}