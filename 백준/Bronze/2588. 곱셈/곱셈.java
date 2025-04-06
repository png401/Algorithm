import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int one = (B%100)%10;
        int ten = (B%100)/10;
        int hundred = B/100;
        
        System.out.println(one*A);
        System.out.println(ten*A);
        System.out.println(hundred*A);
        System.out.println(A*B);
        
        sc.close();
    }
}