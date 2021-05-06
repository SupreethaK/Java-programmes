class ConstructorWithInheritance{
	public static void main(String[] args) {
		B ref = new B();
	}
}

class A{
	A(int value){
		System.out.println("Inside A(int)...");
	}
}

class B extends A{
	B(){
		
		//this(0);
		
		System.out.println("Inside B(int)...");
	}
}