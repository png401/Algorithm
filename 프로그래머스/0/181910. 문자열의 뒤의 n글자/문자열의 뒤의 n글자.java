class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        char [] arr = my_string.toCharArray();
        
        int leng = my_string.length() - n;
        
        for(int i=leng; i<my_string.length(); i++){
            answer = answer + arr[i];
        }
        
        
        return answer;
    }
}