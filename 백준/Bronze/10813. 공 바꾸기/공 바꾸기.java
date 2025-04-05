
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int [] arr = new int [N];
        
        for(int i=0; i<arr.length; i++) {
        	arr[i] = i+1;
        	//System.out.print(arr[i]+" ");
        }
        
        
        
        for(int k=0; k<M; k++) {
        	int i=sc.nextInt()-1;
        	int j=sc.nextInt()-1;
        	
            //템프 쓰는 법 익히자...
        	int temp = arr[i];
        	arr[i] = arr[j];
        	arr[j] = temp;
        }
        
        for(int k=0; k<arr.length; k++) {
        	System.out.print(arr[k]+" ");
        }
        
        
    }
}