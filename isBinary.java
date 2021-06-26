//Write a program to check whether given number is binary or not
package coditas;
import java.util.Scanner;
public class isBinary {
	public static void main(String[] args) {
		boolean result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check whether it is binary or not");
		int num= sc.nextInt();
		System.out.println(isBinaryNumber(num));
	}
	private static boolean isBinaryNumber(int num) {
        if (num == 0 || num == 1
            || num < 0) {
            return false;
        }
        while (num != 0) {
  
            if (num % 10 > 1) {
                return false;
            }
            num = num / 10;
        }
        return true;
		
	}
}