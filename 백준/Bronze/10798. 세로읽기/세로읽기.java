import java.util.Scanner;


public class Main{
    

	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String line ="";
        int max=0;
        char [][] ar = new char [5][15];
        
        for(int i=0; i<5; i++) {
        	for(int j=0; j<15; j++) {
        		ar [i][j] =' ';
        	}
        }
        
        //배열 입력받기. String.charAt(인덱스);
        for(int i=0; i<5; i++) {
        	line = sc.nextLine();
        	for(int j=0; j<line.length(); j++) {
        		ar[i][j] = line.charAt(j);
        		//아 이것만 쓰면 0~14까지 돌다가 line.charAt(j)
        		//못 받는 불쌍한 애들이 생기면 에러가 생긴대...
        		//그래서 그것들을 ' ' 해줘야한다함..
        	}
        	
        }
        
        //배열 출력
        for(int j=0; j<15; j++) {
        	for(int i=0; i<5; i++) {
        		if(ar[i][j] != ' ') System.out.print(ar[i][j]);
        	}
        }
}
}