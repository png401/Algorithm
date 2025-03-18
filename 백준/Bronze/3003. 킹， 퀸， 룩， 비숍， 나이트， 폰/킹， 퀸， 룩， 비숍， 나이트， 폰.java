import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    
    	int King, Queen, Look, Bishop, Knight, Pawn;
    	
    	Scanner input = new Scanner(System.in);
    	
    	King = input.nextInt();
    	Queen = input.nextInt();
    	Look = input.nextInt();
    	Bishop = input.nextInt();
    	Knight = input.nextInt();
    	Pawn = input.nextInt();
    	
    	int nking, nqueen, nlook, nbishop, nknight, npawn;
    	
    	nking = 1-King;
    	nqueen = 1-Queen;
    	nlook = 2-Look;
    	nbishop = 2-Bishop;
    	nknight = 2-Knight;
    	npawn = 8-Pawn;
    	
    	System.out.print(nking+" "+nqueen+" "+nlook+" "+nbishop+" "+ nknight+" "+npawn);
    	
    }
    }
        