interface Drawing {
	void draw();
}

class Circle implements Drawing{
	//@Override
	public void draw() {
		System.out.println("Circle is drawn...");
	}
}

class Triangle implements Drawing{
	//@Override
	public void draw(){
		System.out.println("Triangle is drawn...");
	}

	void shade(){
		System.out.println("Shade the triangle...");
	}
}


class RuntimePolymorphismDemo{
	public static void main(String[] args) {
Drawing d = new Circle();
d.draw();
d = new Triangle();
d.draw();
new Triangle().shade();
}
	}
