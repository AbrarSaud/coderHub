package area_of_rectangle;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner myObj = new Scanner(System.in); 
		 System.out.print("width=");
		 int width = myObj.nextInt();
		 System.out.print("height=");
		 int height = myObj.nextInt();
		 System.out.println( area_of_rectangle(width, height));
	}
	public static int area_of_rectangle(int width, int height) {
	    // write your code here
	    int w =width ;
	    int h= height;
		return w * h;
	    
	}

}
