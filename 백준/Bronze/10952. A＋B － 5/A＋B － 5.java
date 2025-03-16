import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        
        int j=0;
        while(true){
            int A = input.nextInt();
            int B = input.nextInt();
            
            if(A==0 && B==0){
                break;
            }
            System.out.println(A+B);
        }
        input.close();
        
    }
    
}