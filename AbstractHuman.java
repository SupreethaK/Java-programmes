abstract class AbstractHuman{
	private  abstract void eat();
	abstract void sleep();

	void breathe(){ 
		System.out.println("Human's breathe...");
	}
}

class Prashanth extends AbstractHuman{
	@Override
	void eat(){
		System.out.println("Prashanth's eat...");
	}

	@Override
	void sleep(){
		System.out.println("Prashanth's sleep...");
	}
}


class AbstractDemo{
	public static void main(String[] args) {
		Prashanth ref = new Prashanth();
		ref.eat();
		ref.sleep();
		ref.breathe();

		// Human human = new Human();//Doesn't work, Human is abstract


	}
}