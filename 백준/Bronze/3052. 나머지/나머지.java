import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int [10];
		int [] arr1 = new int [42];
		int count=0;
		//배열 입력
		for(int i=0; i<10; i++) {
			arr[i] = sc.nextInt();
			arr1[arr[i]%42] = 1;  
		}
		
		

		/*for(int i=0; i<41; i++)
			System.out.print(arr1[i] +" "); */
		
		//42로 나눈 나머지값들에 대한 배열
		for(int i=0; i<42; i++) {
	
			if(arr1[i]==1) count++;
		}
		System.out.println(count);
		

		sc.close();
	}

}
