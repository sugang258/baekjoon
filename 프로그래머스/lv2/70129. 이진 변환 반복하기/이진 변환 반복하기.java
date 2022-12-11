class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        //System.out.println(s.length());
        int count = 0;
        int leng = 0;

      while(!s.equals("1")){
          leng=0;

                answer[0]++;
            for(int i=0;i<s.length();i++){
             
                if(s.charAt(i) == '0') {
                    //s= s.replace(s.charAt(i),' ');
                    answer[1]++;
                }else{
                    leng++;
                }
                
                
                //String ss = String.join("",word);
                //System.out.println(s);

            }
                      s = Integer.toBinaryString(leng);

             
             }
              
                     return answer;

             }
}