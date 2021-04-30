class A {
	byte b;
	void met(){	
		System.out.println("inside met...");
	}
	A() {
		this.b=56;
		System.out.println("constructor is called...");		
	}
}
class Constructors2 {
	public static void main(String[]args){
		A a=new A();
		A v=new A();
		System.out.println(a.b);
			System.out.println(v.b);



	}
}