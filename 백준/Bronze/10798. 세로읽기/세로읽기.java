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
        		System.out.print(ar[i][j]);
        	}
        
        
        	
        	/*char[][] ar = new char [5][];
            int max=0;
            String line1 ="";
            String line2 ="";
            String line3 ="";
            String line4 ="";
            String line5 ="";
            
            
            line1 = sc.nextLine();
            line2 = sc.nextLine();
            line3 = sc.nextLine();
            line4 = sc.nextLine();
            line5 = sc.nextLine();

            line1.charAt(0)
            */
        	
     }
    
}
}