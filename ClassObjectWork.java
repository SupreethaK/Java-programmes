class ClassObjectWork {
public static void main(String[]args) {

Fan f=new Fan();

f.BlowsAir();
f.Rotates();
f.fancost=1000;
System.out.println(f.fancost);

}
}
class Fan {

int fancost;

void BlowsAir() {
System.out.println("Blowing air");
}

void Rotates() {
System.out.println("Fan is rotating");
}
}

