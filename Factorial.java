import java.util.Scanner;
class Factorial{
public static void main(String[]args) {

int mul=1;

Scanner theScan=new Scanner(System.in);
System.out.println("enter the num");

int a=theScan.nextInt();

for(int i=a;i>=1;i--)
{
mul=mul*i;
}
System.out.println(mul);
}
}




