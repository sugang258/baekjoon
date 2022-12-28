class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int leng = (int)(Math.log10(x)+1);
        int[] xx = new int[leng];
        for(int i=0; i<leng;i++){
            String num = String.valueOf(x);
            xx[i] = Integer.parseInt(num.substring(i,i+1));
            
        }
        
        int all = 0;
        for(int i=0;i<leng;i++){
            all = all + xx[i];
        }
        System.out.println(all);
        
        if(x % all == 0) {
            answer =true;
        }else{
            answer = false;
        }
    
        return answer;
    }
}