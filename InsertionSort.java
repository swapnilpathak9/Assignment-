package coditas;

import java.util.Scanner;

public class InsertionSort {
	public static void main(String[] args) {  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total a number of element");
		int n=sc.nextInt();
		int a[]=new int[n];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the element at index " +i);
			a[i]=sc.nextInt();  
		}  
	    for(int k=1; k<n; k++)   
	    {  
	        int temp = a[k];  
	        int j= k-1;  
	        while(j>=0 && temp <= a[j])  
	        {  
	            a[j+1] = a[j];   
	            j = j-1;  
	        }  
	        a[j+1] = temp;  
	    }  
	    System.out.println("printing sorted elements ...");  
	    for(int i=0;i<10;i++)  
	    {  
	        System.out.println(a[i]);  
	    }  
	}  

}
