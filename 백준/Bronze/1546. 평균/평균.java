import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        double [] ar = new double [N];
        int max=0;
        
        for(int i=0; i<N; i++) {
        	int score = sc.nextInt();
        	ar[i]=score;
        	//System.out.println(ar[i]);
        	if(max<score) max=score;
        }
        
        //System.out.println(max);
        
        double total=0;
        for(int i=0; i<N; i++) {
        	//System.out.println(ar[i]);
        	ar[i] = (double)(ar[i]/max)*100;
        	//System.out.println(ar[i]);
        	total = total+ar[i]; 
        }
        
        System.out.println((double)total/N);
        
        
        
    }
    
}