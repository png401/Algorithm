import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int [] jari = new int [10];
	
	int A = sc.nextInt();
	int B = sc.nextInt();
	int C = sc.nextInt();
	
	int result = A*B*C;
	int ah=0;
	while(true) {
		
		ah = result % 10;
		jari [ah] ++;
		result = result /10;
		
		if(result ==0) break;
		
	}
	
	for(int i=0; i<jari.length; i++) {
		System.out.println(jari[i]);
	}
	
	//result % 10; //1의 자리 수
	
	
	
	}
}