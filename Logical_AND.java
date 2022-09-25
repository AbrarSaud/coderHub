import java.util.Scanner;

public class Logical_AND {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner myObj = new Scanner(System.in); 
		 System.out.print("a=");
		 boolean a =myObj.nextBoolean();  
		 System.out.print("b=");
		 boolean b =myObj.nextBoolean();  
		 System.out.println(logical_and(a, b));
	}
	public static boolean logical_and(boolean a, boolean b) {
	   
		boolean x= a;
		boolean y= b;
	
		boolean and = x && y;    
	
		return and ;
	}
}
