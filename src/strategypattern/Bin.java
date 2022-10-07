package strategypattern;

public class Bin extends Person {

	public Bin() {
		sayStrategy = new NotHungryStrategy();
	}

	@Override
	void eat() {
		System.out.println("그냥 돈까스!");
	}
}
