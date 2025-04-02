import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int [] number = new int [30];
        
        for(int i=0; i<28; i++){
            number[sc.nextInt()-1]=1;
        } 
        
        for(int i=0; i<number.length; i++){
            if(number[i]==0) 
        	System.out.println(i+1);
        }
        
        
    }
}