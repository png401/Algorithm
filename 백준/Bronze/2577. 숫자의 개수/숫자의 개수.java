import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        int num = A*B*C;
        
        int arr [] = new int [10];
        
        /*
        int one = num%10; //일의 자리수
        int two = (num/10)%10; //십의 자리수
        int three =((num/10)/10)%10;//백의 자리수
        */
       
        int count=0;
        while (num > 0) {
        	int t = num % 10;
        	
        	arr[t]++;
        	num /= 10;
        	count++;
        }
        
        for(int i=0; i<10; i++) {
        System.out.println(arr[i]);
        }
       
        
        
        
        sc.close();
    }
}