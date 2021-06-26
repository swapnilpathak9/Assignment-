//Write a program to check whether given number is prime or not
package coditas;
import java.util.Scanner;  
public class isPrime {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);   
	       System.out.print("Enter the number : ");  
	       int num = sc.nextInt();  
	       System.out.println("List of prime numbers between 1 to " + num);  
	       for (int i = 1; i <= num; i++) {  
	           if (isPrime(i)) {  
	               System.out.println(i);  
	           }  
	       }

	}
	  public static boolean isPrime(int n) {  
	       if (n <= 1) {  
	           return false;  
	       }  
	       for (int i = 2; i <= Math.sqrt(n); i++) {  
	           if (n % i == 0) {  
	               return false;  
	           }  
	       }  
	       return true;  
	   }  

}
