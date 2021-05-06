enum Sharemarket {
	Diamond(1),Gold(2),Silver(3),Bronze(4);
	private int Ranking;

Sharemarket(int Ranking){
	this.Ranking=Ranking;
}
int getRanking(){
	return this.Ranking;
}
}
class website{
	void getUpdate(){
		System.out.println("The ranking of today's sharemarket is :");
		for(Sharemarket price:Sharemarket.values()){
		System.out.println("The ranking for"+" "+price+"  is"+" "+price.getRanking());	
		}
	}
}
class Decleration{
	public static void main(String[] args) {
		new website().getUpdate();
	}
}