import java.util.*;
import java.io.*;

class CubeSum {
public static void main(String args[]){
    int input=0;
    int num1,num2,num3;


    System.out.println("Enter a Number");
    Scanner console = new Scanner(System.in);
    input= Integer.parseInt(console.nextLine());

     int sum=0;
    int number = input; 
    int counter = 0; 

    while(number>0){
        int t= number%10;
        System.out.println("Cube of "+t +" is "+(t*t*t));
sum=sum+(t*t*t);
        System.out.println("sum is:"+sum);
        counter = counter+1;
        number = number/10;

    }
}
    }