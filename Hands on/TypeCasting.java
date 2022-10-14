package javaprojrct;

import java.util.Scanner;

public class TypeCasting {

	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number : ");
		int z = sc.nextInt();
		sc.close();
		long x = z;
		float y = x;
	
		System.out.println("The value of int is : "+z);
		System.out.println("The value of float is : "+y);
		System.out.println("The value of long is : "+x);
	}
}