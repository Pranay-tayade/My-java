/*
  Question - WAP to enter even number in array and print in ascending order.
  Name - Pranay Jeevan tayade.
  Date - 14/10/2022.
 */









package javapractical;

import java.util.*;

public class EvenOrder {

	
	public static void main(String args[])
	{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of element in array");
			
			int a = sc.nextInt();
				
			
			Integer array[]=new Integer[a];
			
			System.out.println("Enter elements ");
			{
			for(int i=0;i<a;i++)
			{
				int n = sc.nextInt();
				if(n%2==0) {
				array[i] = n;
				}
				else {
					array[i]=0;
				}
			}
			sc.close();
			System.out.println("Original array" + Arrays.toString(array));
		
			Arrays.sort(array);
			for(int i=0;i<a;i++) {
			if(array[i]%2==0)
			{
			System.out.println("Ascending array is: " +(array[i]));
			}
			}
			}
}
}
