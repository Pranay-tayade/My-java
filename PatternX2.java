import java.util.*;
class PatternX2
{
public static void main(String args[])
{
//Scanner sc = new Scanner (System.in);
//System.out.print("enter number how large x should be ");
int i = 10;
for (int j = 1; j<=i;j++)
{
for (int h = 1; j<=i;h++)
{
if(j==h||j+h==11)
System.out.print("*");
else
System.out.print(" ");

}
System.out.println();
}
}
}