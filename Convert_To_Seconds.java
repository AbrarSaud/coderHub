import java.util.Scanner;

public class Convert_To_Seconds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner myObj = new Scanner(System.in); 
		 System.out.print("hours=");
		 int hours = myObj.nextInt();
		 System.out.println(convert_to_seconds(hours));
	}
	public static int convert_to_seconds(int hours) {
	    // write your code here
		int h =hours;
		
		return h * 3600 ;
	}
}
