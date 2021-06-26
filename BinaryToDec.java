//Write a program to convert decimal number to binary format.
package coditas;

import java.util.Scanner;

public class BinaryToDec {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Binary Number");
		int binary = sc.nextInt();
		 int decimal = 0;  
		    int n = 0;  
		    while(true){  
		      if(binary == 0){  
		        break;  
		      } else {  
		          int temp = binary%10;  
		          decimal += temp*Math.pow(2, n);  
		          binary = binary/10;  
		          n++;  
		       }  
		     
		    }
		    System.out.println("Decimal coversition of number is"+decimal);

}
}