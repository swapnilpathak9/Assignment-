package coditas;

//Write a program to print fibonacci series.


import java.util.Scanner;

public class Fibbo {

	public static void main(String[] args) {
		int first_no=0, second_no = 1,result;
		int user_no;
		int count=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number");
		user_no=sc.nextInt();
		while(true)
		{
			result=first_no+second_no;
			count++;
			if(result>=user_no)
			{
				break;
			}
			first_no=second_no;
			second_no=result;
			System.out.println("\n Fib No."+count+"]->"+result);
		}
	}

}
