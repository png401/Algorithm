import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int total = input.nextInt();
        int num = input.nextInt();
        int small_Total=0;
        int Total=0;
        
        for(int i=0; i<num; i++){
            int price = input.nextInt();
            int small_Num = input.nextInt();
            small_Total = price*small_Num;
            Total = Total+small_Total;
        }
        
        if(total == Total){
            System.out.println("Yes");
        }
        else
            System.out.println("No");
        
        
        
    }
    
}