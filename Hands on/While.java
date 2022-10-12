/*
topic : program to demostrate while loop continue till the number is positive 
name : pranay tayade
date : 12/10/2022

*/

package javaprojrct;

import java.util.Scanner;

class While {

	public static void main (String args[])
	{
	    Scanner sc = new Scanner(System.in);
		System.out.println(" Enter a digit : ");
		int x = sc.nextInt();
				
		sc.close();		
		
		while(x>0)
		{
			System.out.println("positive number is : "+x);
			x++;
			break;
		}
	}
}
