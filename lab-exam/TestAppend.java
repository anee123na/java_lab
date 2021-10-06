import java.io.*;
import java.util.Scanner;
class Append
{
int n,m;
Scanner obj=new Scanner(System.in);
void read()
{
System.out.println("Enter the first number");
n=obj.nextInt();
System.out.println("Enter the second number");
m=obj.nextInt();
}
void disp()
{
System.out.println("The first number is:"+n);
System.out.println("The second number is:"+m);
System.out.println("THe appended number is"+n+m);
}
}
class TestAppend
{
public static void main(String args[])
{
Append t=new Append();

t.read();
t.disp();
}
}
