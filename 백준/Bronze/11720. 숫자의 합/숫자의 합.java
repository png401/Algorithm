import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] ar = new int [N];
        int total = 0;
        String temp = sc.nextLine();//엔터먹기
        String line = sc.nextLine();
        char [] chars = line.toCharArray();
        //int [] nums = new int [char.length];
        
        for(int i=0; i<N; i++) {
        	ar[i] = chars[i] - '0';
        	total += ar[i];
        }
        
        System.out.println(total);
        
        
    }
}