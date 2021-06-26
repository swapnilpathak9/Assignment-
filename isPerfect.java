////Write a program to check whether given number is perfect or not
package coditas;

import java.util.Scanner;

public class isPerfect {

	public static void main(String[] args) {
		int i=1;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int  n = sc.nextInt();
		while(i<n)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
			i++;
		}
		if(sum==n)
		{
			System.out.println("Number is perfect");
		}
		else
		{
			System.out.println("Number is not perfect");
		}
	}

}
