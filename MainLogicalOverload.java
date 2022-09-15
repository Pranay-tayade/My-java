class MainLogicalOverload
{
static public void main(String[] args)
{
LogicalOverload x = new LogicalOverload();
LogicalOverload z = new LogicalOverload("Anudip");
String e = "masud";
int a = 45365;
String y = "Java";
z.Tell(a);
z.Tell(e, a);
z.Tell(e, a, y);
x.Tell(a);
x.Tell(e, a);
x.Tell(e, a, y);
}
}
