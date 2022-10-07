package strategypattern;

public class Jin extends Person {

	public Jin() {
		sayStrategy = new NotHungryStrategy();
	}

	@Override
	void eat() {
		System.out.println("치즈 돈까스!");
	}
}
