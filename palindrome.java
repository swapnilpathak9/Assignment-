//Check if a given string or number is palindrome or not.
package coditas;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		String original, reverse = "";
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string or number");
	      original =sc.next();
	      int length = original.length();   
	      for ( int i = length - 1; i >= 0; i-- )  
	         reverse = reverse + original.charAt(i);  
	      if (original.equals(reverse))  
	         System.out.println("Entered string/number is a palindrome.");  
	      else  
	         System.out.println("Entered string/number isn't a palindrome."); 

	}

}
