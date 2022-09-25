package deleteLastChar;

import java.util.Scanner;

public class deleteLastChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner myObj = new Scanner(System.in); 
		 System.out.print("word=");
		 String word =myObj.next();
		 System.out.println( deleteLastChar( word));
	}
	public static String deleteLastChar(String word) {
	    // write your code here
		String delete = word.substring(0, word.length() - 1);

		return delete ;
	}

}
