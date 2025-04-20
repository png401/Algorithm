import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//테스트 케이스 개수
        sc.nextLine();
        
        for(int i=0; i<n; i++){
            String line = sc.nextLine();
            int score = 0;
            int streak = 0;
            
            for(int j=0; j<line.length(); j++){
                if(line.charAt(j)=='O'){
                    streak++;
                    score+=streak;
                } else {
                    streak = 0;
                }
            }
            System.out.println(score);
        }
    }
}