class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        
        int count=0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor ==0){
                count++;
            }
        }
        
        if(count==0){
            answer = new int [] {-1};
        }
        
        else{
        answer = new int[count];
        int a = 0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor == 0){
                answer[a] = arr[i];
                a++;
            }
        }
        }
        
        for(int j=0; j<answer.length-1; j++){
            for(int k =0; k<answer.length-1-j; k++){
                if(answer[k] > answer[k+1]){
                    int temp=answer[k];
                    answer[k] = answer[k+1];
                    answer[k+1] = temp;
                }
            }
        }
        
        
        return answer;
    }
}