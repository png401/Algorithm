import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [42];
        //수 10개 입력, 이를 42로 나눈 나머지
        //입력받을 때마다 42로 나누었을 때의 나머지를 배열에 입력
        //(배열크기 42로 하면 나머지 0~41이 표현되잖아..?)
        //
        //예) 1 1 1 1 1 2 2 2 2 2
        
        for(int i=0; i<10; i++) {
        	int input = sc.nextInt();
        	int num = input%42;
        	arr[num]++;
        }
        
        int count=0;
        
        for(int j=0; j<arr.length; j++) {
        	if(arr[j] != 0) {
        		count++;
        	}
        }
        System.out.println(count);
    }
    
}