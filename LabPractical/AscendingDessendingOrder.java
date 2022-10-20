/*
  Question - Array Ascending Descending Order.
  Name - Pranay Jeevan Tayade.
  Date - 20/10/2022.
 */







package javapractical;

import java.util.*;


public class AscendingDessendingOrder {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number For Array");
		int m = sc.nextInt();
		Integer array[]=new Integer[m];
		
		System.out.println("Enter elements ");
		
		for(int i=0;i<m;i++)
		{
			array[i] = sc.nextInt();
		}
		
		System.out.println("Original array" + Arrays.toString(array));
		
		Arrays.sort(array,Collections.reverseOrder());
		System.out.println("Descending array is" + Arrays.toString(array));
		
		for(int i=0;i>m;i++)
		{
			array[i] = sc.nextInt();
		}
		
		System.out.println("Original array" + Arrays.toString(array));
		
		Arrays.sort(array);
		System.out.println("Descending array is" + Arrays.toString(array));
		sc.close();
	}

}
