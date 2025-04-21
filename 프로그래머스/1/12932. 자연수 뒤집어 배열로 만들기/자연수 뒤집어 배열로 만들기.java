class Solution {
    public int[] solution(long n) {
        
        int count=0;
        long temp=n;
        
        while(temp>0){
            temp = temp/10;
            count++;   
        }
        
        int[] answer = new int [count];
        
        for(int i=0; i<count; i++){
           
            answer[i] = (int)(n%10);
            n = n/10;
        }
        
        return answer;
    }
}