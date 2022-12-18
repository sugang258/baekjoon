import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        if(s.charAt(0) ==')'){
                return false;
            }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ')'){
                if(!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                }else{
                    return false;
                }
            }else{
                stack.push(s.charAt(i));
            }
        }
        if(!stack.empty()){
            return false;
        }
        
        return answer;
    }
}