class Solution {
    public String solution(int a, int b) {
        
        int [] day_by_month = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int count=0;
        
        if(a>1){
        for(int i=a-1; i>0; i--){
            count += day_by_month[i];
        }
        }
        
        else{
            count =0;
        }
            
        
        int rest = (b+count)%7;
        
        String [] day = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        
        
        
        //day_by_month[b]+day_by_month[b-1];
        
        
        
        String answer = "";
        
        answer = day[rest];
        
        return answer;
    }
}