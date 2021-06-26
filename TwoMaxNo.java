//Write a program to find maximum two number from array
package coditas;
import java.util.Arrays;
public class TwoMaxNo {

	public static void main(String[] args) {
		int arr[]= {5,4,3,2,1};
		Arrays.sort(arr);
		int n=arr.length;
		System.out.println("Max number is "+arr[n-1]);
		System.out.println("Max number is "+arr[n-2]);
	}

}
