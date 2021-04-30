package supreetha;
class ScopePackagePrivateDemo {
	public static void main(String[]args) {
		Other ot=new Other();
		ot.doSomething();
	}
}
public class Other {
	int var;
	void doSomething(){
		System.out.println("inside doSomething().....");
	}
}