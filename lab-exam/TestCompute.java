import java.io.*;
import java.util.Scanner;
class Compute
{
void calculate(int n,char ch)
{
if(ch=='s')
{
int sq=n*n;
System.out.println("Square="+sq);
}
else
{
int cu=n*n*n;
System.out.println("cube="+cu);
}
}
public void calculate(int n,int m,char ch)
{
if(ch=='p')
{
int pro=n*n;
System.out.println("Square="+pro);
}
else
{
int add=n+n+n;
System.out.println("Addition="+add);
}
}
public void calculate(String s1,String s2)
{
if(s1.equals(s2))
{
System.out.println("The strings are equals");
}
else
{
System.out.println("strings are not equal");
}
}
}
class TestCompute 
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

Compute co=new Compute();


co.calculate(6,'p');
co.calculate(7,8,'s');
co.calculate("ANEENA","ANEENA");
}
}























