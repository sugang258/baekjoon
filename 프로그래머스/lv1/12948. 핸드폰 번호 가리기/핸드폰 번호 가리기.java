import java.util.*;
class Solution {
    public String solution(String phone_number) {
        String answer = "";

        String front = "";
        String back = "";
        for(int i = 0; i < phone_number.length()-4; i++){
            answer += "*";
        }

        back = phone_number.substring(phone_number.length()-4,phone_number.length());
        answer += back;

        return answer;
    }
}