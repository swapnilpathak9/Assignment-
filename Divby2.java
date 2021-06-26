//Write program to check if a number is power of 2 or not
package coditas;

import java.util.Scanner;

public class Divby2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check");
		int n = sc.nextInt();
		if(n%2==0)
		{
			System.out.println("Number is power of 2");
		}
		else
			System.out.println("Number is not power of 2");
	}

}
