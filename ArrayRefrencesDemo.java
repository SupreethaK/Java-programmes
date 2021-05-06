		
class ArrayRefrencesDemo{
	public static void main(String[] args) {
		Trainer []trainers = new Trainer[3];

		// trainers[0] = new Trainer(); //Still not allowed
		trainers[0] = new EnglishTrainer();
		trainers[1] = new SoftwareTrainer();
		trainers[2] = new EnglishTrainer();

		for(Trainer tempTrainer: trainers){
			tempTrainer.train();
			if(tempTrainer instanceof SoftwareTrainer)
				((SoftwareTrainer)tempTrainer).code(); 
		}
	}
}