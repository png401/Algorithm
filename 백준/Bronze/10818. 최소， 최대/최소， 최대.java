import java.util.Scanner;

//만약 for문 하나 안에서 모든 걸 하기 어렵다면 그냥 조각조각 단계나눠서 하기
//입력for문, 초기화따로, 출력따로
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //처음 입력된 걸 max,min값으로 설정하려면 어케야 하지...?
        int[] ar = new int [N];
        
        //배열에 값들 입력 따로, max 산출 따로, 출력 따로 하기
        for(int i=0; i<N; i++) {
        	ar[i] = sc.nextInt();
        	//이렇게 하면... 기껏 max값에 최대값 넣어뒀는데 새로운 입력값들로 초기화되지 않나..?
        	/*max=num;
        	min=num;
        	if(num>max) {
        		max=num;
        	}*/
        }
        int max= ar[0];
        int min=ar[0];
        //max,min값
        for(int i=0; i<N; i++) {
        	//이게 초기화한 거 아님?
        	if(ar[i]>max) max=ar[i];
        	if(ar[i]<min) min=ar[i];
        }
        
        System.out.println(min +" "+ max);
        
     }
    
}