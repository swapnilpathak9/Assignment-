//Write a program to find missing number from array
package coditas;
import java.util.Scanner; 
public class MissingNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      int n = 100;
	      int inpuArray[] = new int[n];
	      System.out.println("Enter (n-1) numbers: ");
	      for(int i=0; i<=n-2; i++) {
	         inpuArray[i] = sc.nextInt();
	      }
	      int sumOfAll = (n*(n+1))/2;
	      int sumOfArray = 0;
	      for(int i=0; i<=n-2; i++) {
	         sumOfArray = sumOfArray+inpuArray[i];
	      }
	      int missingNumber = sumOfAll-sumOfArray;
	      System.out.println("Missing number is: "+missingNumber);
	}

}
