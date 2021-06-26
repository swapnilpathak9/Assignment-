//Write a program to find the given number is Armstrong number or not?
package coditas;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int temp;
		int sum;
		int i=1;
		int n=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number ");
		int num=sc.nextInt();
		sum=0;
		i=num;
		while(num>0)
		{
			n=num%10;
			num=num/10;
			sum=sum+(n*n*n);
		}
		if(sum==i)
		{
			System.out.println("Number is armstrong");
		}
		else
		{
			System.out.println("Number is not armstrong");
		}
		

	}

}
