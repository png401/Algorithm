import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int floor = input.nextInt();
		
		for(int i=1; i<=floor; i++) {
			for(int j=1; j<=floor-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
            System.out.println();
		}
		
		
	}

}