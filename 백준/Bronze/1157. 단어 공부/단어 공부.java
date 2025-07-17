
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//입력받은 걸 대문자로 바꾸고
		String input = sc.next().toUpperCase();
		//String [] word = input.split("");
		
		//
		int [] arr = new int [26];
		int max=0;
		//char alphabet;
		for(int i=0; i<input.length(); i++) {
			arr[input.charAt(i)-'A']++;
			
		}
		char word = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=0) {
				if(arr[i]>max) {
					max = arr[i];
					word = (char)((char)i+'A');
				}
			}
		}
		int count=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==max) count++;
		}
		
		if(count>1) System.out.println("?");
		else System.out.println(word);
		
		
	}

}