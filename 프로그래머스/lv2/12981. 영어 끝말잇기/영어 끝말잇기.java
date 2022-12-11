class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        
        int aa = 0;
        int aa2 = 0;
        for(int i=1; i<words.length;i++) {
            
            
            
            String a = words[i-1].substring(words[i-1].length()-1,words[i-1].length());
            String b = words[i].substring(0,1);
           // System.out.println(words[].contains(words[i]));
            
            System.out.println("b : " + b);
            System.out.println(a);
            for (int j=0;j<=i-1;j++) {
                System.out.println("i : " +words[i]);
                System.out.println("j : " + words[j]);
                
                System.out.println(words[i].equals(words[j]));
                System.out.println(i);
                System.out.println("j : "+j);
                if(words[i].equals(words[j])) {
                    
                    if((i+1)%n == 0) {
                        aa = n;
                    }else {
                        aa = (i+1)%n;
                    }
                    System.out.println("aa : " +aa);
                    
                    aa2 = i/n +1;
                    answer[0] = aa;
                    answer[1] = aa2;
                 
                    
                    break;
                }
            }
            if(aa != 0) {
                break;
            }
            
            if(!a.equals(b)) {
                System.out.println("iii : "+i);

                if((i+1)%n == 0) {
                        aa = n;
                    }else {
                        aa = (i+1)%n;
                    }
                

                
                    aa2 = i/n +1;
                answer[0] = aa;
                    answer[1] = aa2;

                break;

            }else{
                    aa=0;
                    aa2 =0;
                    answer[0] = aa;
                    answer[1] = aa2;
             
               
            }
        

            }
      
            
        

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다. 

        return answer;
    }
}