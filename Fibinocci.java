class Fibinocci {
public static void main(String[]args) {

int a=0;
int b=1;
for(int i=3;i<=12;i++)//i is starting from 3 because first 2 integers are already printed

{
int sum=a+b;


System.out.println(sum);
a=b;
b=sum;
}
}
}