import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		sc.nextLine();//엔터먹기
		String input = "";
		
		for(int i=0; i<T; i++) {
			input = sc.nextLine();
			
			//if(input.length()==1) System.out.println(""+input+input);
			char ch1 = input.charAt(0);
			char ch2 = input.charAt(input.length()-1);
			System.out.println(""+ch1+ch2);
		}
		
		
		
	}
	
	
}
