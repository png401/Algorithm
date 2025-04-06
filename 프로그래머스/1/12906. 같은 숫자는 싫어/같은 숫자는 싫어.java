import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
      
            //이전 숫자 기억하기
            //다르면 그 숫자 저장하기
            ArrayList <Integer> result = new ArrayList <>();
            
            int temp = -1;
            
            for(int num : arr){
                if(num != temp){
                result.add(num);
                temp = num;
            }
            }
            
        int[] answer = new int [result.size()];
        for(int i=0; i<result.size(); i++){
            answer[i] = result.get(i);
        }
        
        
        
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        //System.out.println("Hello Java");

        return answer;
    }
}