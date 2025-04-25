import java.util.Scanner;


public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int [][] ar = new int [9][9];
        int max=0, row=0, col=0;
        
        //9*9 행렬 입력
        for(int i=0; i<ar.length; i++) {
        	for(int j=0; j<ar[0].length; j++) {
        		ar[i][j] = sc.nextInt();
        		if(ar[i][j]>max) {
        			max = ar[i][j];
        			//System.out.println(max);
        			row = i;
        			col = j;
        			//System.out.println(row+" "+col);
        		}
        	}
        }
        
        //출력
        System.out.println(max);
        System.out.println((row+1) + " "+ (col+1));
        //와 나.... 그냥 col+1하니까 6, 1 합쳐서 61이 나옴..ㅋㅋ큐ㅠㅠㅠ및췬
        
        
        
     }
    
}