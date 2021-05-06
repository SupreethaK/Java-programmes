class ArrayDemo {
public static void main(String[]args) {

java.util.Scanner scan=new java.util.Scanner(System.in);

int []arr=new int[5];

System.out.println("Enter the numbers");

for(int i=0;i<arr.length;i++) {
arr[i]=scan.nextInt();
}

System.out.println("You have entered");
for(int value:arr){
System.out.println(value);
}
}
}
