class Solution {
    public String solution(String s) {
        String answer = "";
        int half = s.length()/2;
        
        if(s.length()%2 != 0){
            answer = ""+s.charAt(half);
        }
        else{
            answer = ""+s.charAt(half-1)+s.charAt(half);
        }
            
        
        
        
        return answer;
    }
}