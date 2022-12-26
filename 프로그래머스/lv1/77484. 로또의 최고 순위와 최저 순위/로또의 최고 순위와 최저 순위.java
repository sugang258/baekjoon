class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {

        int zeroCount =0;
        int count =0;
        int max=0;
        
        for(int lotto : lottos){
            if(lotto == 0) {
                zeroCount++;
            }
            for(int win_num : win_nums){
                if(lotto == win_num){
                    count++;
                }
            }
        }
        
        max = zeroCount + count;
        if(max == 0){
            max =1;
        }
        if(count == 0){
            count =1;
        }

        int answer[] = {7-max, 7-count};

        return answer;
    }
    
    
}