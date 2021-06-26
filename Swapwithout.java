//Write a program to swap two number without using third variable
package coditas;
import java.util.Scanner;
public class Swapwithout {

	public static void main(String[] args) {
		int a;
		int b;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first variable");
		a=sc.nextInt();
		System.out.println("Ennter Second Variable");
		b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Value of a is "+a+" and b is "+b);
	}

}
