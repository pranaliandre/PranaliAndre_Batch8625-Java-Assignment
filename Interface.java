import java.io.*;
interface in1
{
final int a = 5;
void display();
}

class testClass implements in1
{
public void display()
{
System.out.println("Boy");
}
public static void main (String[] args)
{
testClass t = new testClass();
t.display();
System.out.println(a);
}
}
