class MultiplyByUsingMethodsWithParametersAndReturnType {
public static void main(String[]args) {
java.util.Scanner scan=new java.util.Scanner(System.in);

System.out.println("Enter 2 numbers to multiply");

int firstvalue=scan.nextInt();

int secondvalue=scan.nextInt();
System.out.println(new MultiplyByUsingMethodsWithParametersAndReturnType().Multiply(firstvalue,secondvalue));
}

int Multiply(int firstvalue, int secondvalue) {
return(firstvalue*secondvalue);
}
} 


