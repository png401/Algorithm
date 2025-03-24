import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); // 정수 개수 입력
        int array [] = new int [N];
        
        //배열 입력
        for(int i=0; i<N; i++){
            array [i] = sc.nextInt();
        }
        
        //최대, 최소값 초기화
        int min = array[0];
        int max = array[0];
        
        //루프 돌면서 갱신
        for(int i=1; i<N; i++){
            if(array[i]<min) min=array[i];
            if(array[i]>max) max=array[i];
        }
        
        System.out.println(min + " " + max);
        sc.close();
    }
}