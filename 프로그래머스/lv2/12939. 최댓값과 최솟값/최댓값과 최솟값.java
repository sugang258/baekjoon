import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] ss = s.split(" ");
        String max =ss[0];
        String min =ss[0];
        for(int i=0;i<ss.length-1;i++){
            
            //System.out.println(ss[i+1]);
            if(Integer.parseInt(ss[i+1]) >Integer.parseInt(max)){
                System.out.println("Yes");
                max = ss[i+1];
            }
            if(Integer.parseInt(ss[i+1]) < Integer.parseInt(min)){
                min = ss[i+1];
            }

        }       
        System.out.println(max);
        System.out.println(min);
        answer = min + " " +max;


        return answer;
    }
}