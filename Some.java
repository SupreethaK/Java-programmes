class Some {
	int var;
	public static void main(String[]args) {
	Some ref = new Some();
	Some otherref=ref.func(ref);
	System.out.println(ref.var);
}
Some func(Some temp){
	temp=new Some();
	temp.var=865;
	return temp;
}
}