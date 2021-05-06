class RectangleArea {
	int length;
	int width;
	void insert(int l,int w){
		length=l;
		width=w;
	}
	void display(){
	System.out.println(length*width);
}
}
class calculate {
	public static void main(String[] args) {
		RectangleArea a=new RectangleArea();
		a.insert(20,10);
		a.display();
	}
}