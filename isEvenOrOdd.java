package isEvenOrOdd;

import java.util.Scanner;

public class isEvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner myObj = new Scanner(System.in); 
		 System.out.print("num=");
		 int num = myObj.nextInt();
		 System.out.println(isEvenOrOdd(num));
	}
	public static String isEvenOrOdd(int num) {
	 
		return (num % 2 == 0) ? "even" : "odd";
	}
}
