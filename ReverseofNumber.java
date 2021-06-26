//Write a program to find reverse of given number
package coditas;
import java.util.Scanner;
public class ReverseofNumber {

	public static void main(String[] args) {
		int n=0, reversed=0, rem;    
		int num=123;
		 while(num != 0) {
		      int digit = num % 10;
		      reversed = reversed * 10 + digit;
		      num /= 10;
		    }
		System.out.println("Reverse of number is "+reversed);
	}
	

}
