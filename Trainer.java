interface Trainer{
	void train();
}

class EnglishTrainer implements Trainer{
	@Override
	public void train(){
		System.out.println("EnglishTrainer's train...");
	}
}

class SoftwareTrainer implements Trainer{
	@Override
	public void train(){
		System.out.println("SoftwareTrainer's train...");
	}

	void code(){
		System.out.println("SoftwareTrainers code as well...");
	}
}


class RuntimePolymorphismDemo{
	public static void main(String[] args) {

		Trainer theTrainer = new EnglishTrainer(); //IS-A

		theTrainer.train(); //At compile time, No clue which version of train would be called

		theTrainer = new SoftwareTrainer(); //IS-A

		theTrainer.train(); //SoftwareTrainer train would be called
		new SoftwareTrainer().code();

	}
}