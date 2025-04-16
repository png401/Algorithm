import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        //이전 값 기억
        //이전 값과 다를 때만 리스트에 추가
        //이전 값 업데이트
        ArrayList <Integer> list = new ArrayList<>();
        
        int before = -1;
        for(int num : arr){
            if(num != before){
                list.add(num);
                before = num;
            }
            
        }
        
        
        
        
        //ArrayList<Integer> -> int [] 로 변환
        answer = new int [list.size()];
        
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}