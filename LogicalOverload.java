class LogicalOverload
{
int Id;
String name;
String Course;
String foundation;

LogicalOverload()
{
System.out.println("Default Contructor");
}

LogicalOverload(String a)
{
foundation = a;
}

void Tell(int Id)
{
System.out.println(Id + " " + foundation);
}

void Tell(String name, int Id)
{
System.out.println(name + " " + Id + " " + foundation);
}

void Tell(String name, int Id, String Course)
{
System.out.println(name + " " + Id + " " + Course + " " + foundation);
}
}