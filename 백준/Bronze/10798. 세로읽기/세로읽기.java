import java.util.Scanner;


public class Main{
    

	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String line ="";
        int max=0;
        char [][] ar = new char [5][];
        
        //얘는 공백 만나면 죽어버림....
        //string nextline 입력받기
        for(int i=0; i<5; i++) {
        	line = sc.nextLine();
        	ar[i] = line.toCharArray();
        	if(max<line.length()) max=line.length();
        	/*이게 틀렸다... 왤까?
        	  for(int j=0; j<line.length(); j++) {
        	char[i][j] ar = line.toCharArray();
        	}*/
        }
        
        //그럼 이제 출력하기
        for(int j=0; j<max; j++) {
        	for(int i=0; i<5; i++) {
        		//그래..가변배열이니까 그냥 0123열까지밖에 없는거일거야..
        		//if(ar[i][j]==' ') {System.out.print("");}
        		if(j < ar[i].length)
                //그니까 가변배열 열크기만큼만 출력하자 생각하는거잖아..
        		//고정배열로도 연습해보기
        		System.out.print(ar[i][j]);
        	}
	
     }
    
}
}