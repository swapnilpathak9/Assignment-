////Write a program find second highest number 
package coditas;
import java.util.Arrays;
public class SecondHighest {

	public static void main(String[] args) {
		int arr[]= {5,4,3,2,1,3,8,7};
		int n=arr.length;
		Arrays.sort(arr);
		if(arr[n-2]!=arr[n-1]) {
			System.out.println("Second Highest element is "+arr[n-2]);
		}
		else if (arr[n-3]!=arr[n-1]) {
			System.out.println("Second Highest element is "+arr[n-3]);
		}
		

	}

}
