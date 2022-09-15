import java.util.Scanner;
class PrimeNumber
{
   void ScanPrime(int i)
{
  boolean flag = false;
 for (int j =2; j<=i/2;j++) 
     {
      if (i % 2==0)
     {
      flag=true;
      break;
}

      if(!flag)
{
   System.out.println(i+" ");
     }
}
}

public static void main(String[] args)
{
Scanner de = new Scanner(System.in);
System.out.println("Enter the starting number:- ");
int a = de.nextInt();
System.out.println("Enter the last number:- ");
int b = de.nextInt();
PrimeNumber p = new PrimeNumber();
System.out.println("Prime number from" + a + "to" + b + "are :-");
for (int y = a; y<=b;y++)
    {
     p.ScanPrime(y);
   }
  }
}
