import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
       int first, second;
        
        while(true){
            first = input.nextInt();
            second = input.nextInt();
        
            if((first==0)&&(second==0)) {
                break;
              }
              
        if(second%first == 0){
            System.out.println("factor");
            
        }
        else if(first%second == 0){
            System.out.println("multiple");
        }
        //second%first == 0 -> factor
        //first%second == 0 -> multiple
        else
            System.out.println("neither");
        }  
        
        input.close();
        
    }
    
}
