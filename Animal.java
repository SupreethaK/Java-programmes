class Animal {
	void eat(){
		System.out.println("animals eat.....");
	}
	final void drink(){
	System.out.println("animals drink water.....");	
	}
}
class Tiger extends Animal{
	void eat(){
	System.out.println("Tiger hunts and eat.....");	
	}
	void drink(){
	System.out.println("Tiger drinks water.....");	
	}

}
class Rabbit extends Tiger{
	void eat(){
	System.out.println("Rabbits eat grass.....");	
	}
	void drink(){
	System.out.println("Rabbit drinks water.....");	
	}
	void run(){
		System.out.println("Rabbit runs.....");
	}
}
class Zoo{
	public static void main(String[] args)
	 {
	 	Tiger t=new Tiger();
	 	Rabbit r=new Rabbit();
		t.eat();
		t.drink();
		r.eat();
		r.drink();
		r.run();
	}
}