import java.util.Scanner;
import java.util.*;
class StringToken
{
      public static void main(String args[])
            {
            Scanner scan=new Scanner(System.in);
System.out.println("Enter the integers: ");
 String digit=scan.nextLine();
 StringTokenizer token=new StringTokenizer(digit);

      
int sum=0;
 System.out.println("Entered digits are : ");
 while(token.hasMoreTokens())
                        
{
       int dig=0;
      String s=token.nextToken();
      dig=Integer.parseInt(s);//here dig is the input we have taken 
System.out.print(dig+" ");
 sum=sum+dig;
}
System.out.println("Sum is : "+sum);
}
}
