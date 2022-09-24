package countWords;

import java.util.Scanner;

public class countWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner myObj = new Scanner(System.in); 
		 System.out.print("txt=");
		 String txt=myObj.next();
		 System.out.println(countWords(txt));
	}
	public static int countWords(String txt)  
    {  

	       int count = 0;
	        if (!(" ".equals(txt.substring(0, 1))) || !(" ".equals(txt.substring(txt.length() - 1))))
	        {
	            for (int i = 0; i < txt.length(); i++)
	            {
	                if (txt.charAt(i) == ' ')
	                {
	                    count++;
	                }
	            }
	            count = count + 1; 
	        }
	        return count; 
    }  
}
