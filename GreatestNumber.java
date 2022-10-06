import java.util.Scanner;
public class GreatestNumber {
       
	void Gnumber()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your First Number :- ");
		int x = sc.nextInt();
		
		System.out.println("Enter your Second Number :- ");
		int y = sc.nextInt();
		sc.close();
		
		if(x>y)
		{
		System.out.println(x + "  Is Greater Than  " + y);
		}
		else
		{
		System.out.println(y + "  Is Greater Than  " + x);
		}
		}
}