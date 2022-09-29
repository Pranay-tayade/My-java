package myproject;

import java.util.Scanner;

public class Palidrome {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String write = sc.nextLine();
		sc.close();
		
		String rev = (new StringBuilder(write)).reverse().toString();
		if (write.equals(rev))
		{
			System.out.println(write.toUpperCase() + " is Palidrome");
		}
		
		else
		{
			System.out.println(write.toUpperCase() + " is not Palidrome");
		}
	}

}