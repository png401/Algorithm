import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        //바구니 1~N, M:몇 번 바꾸겠다.
        //i j 입력 예) 1 4 1번부터 4번째 바구니 순서 역순으로 만들겠다.
        //바구니 배열 0~N-1에 1~N 값을 넣어놓는 게 낫나...?
        //만약 넣었어. 
        //그 뒤 i, j 개수/2 해서 그만큼 for문 카운트 
        //그 for문 안에서 버블소트로 swap 하기
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        int [] arr = new int [N];
        
        //배열 0~N-1에 1~N 값 입력
        for(int m=0; m<arr.length; m++) {
        	arr[m] = m+1; 
        }
        
        
        for(int k=0; k<M; k++) {
        	int i = sc.nextInt();
            int j = sc.nextInt();
            int count = (j-i+1)/2;
            for(int r=0; r<count; r++) {
            	int temp = arr[i-1];
            	arr[i-1] = arr[j-1];
            	arr[j-1] = temp;
            	i++;
            	j--;
            }
        	
        }
        
        for(int k=0; k<arr.length; k++) {
        	System.out.print(arr[k]+" ");
        }
        
        
        
    }
    
}