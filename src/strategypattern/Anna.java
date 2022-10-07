package strategypattern;

public class Anna extends Person {

	public Anna() {
		sayStrategy = new NotHungryStrategy();
	}

	@Override
	void eat() {
		System.out.println("고구마 돈까스!");
	}
}
