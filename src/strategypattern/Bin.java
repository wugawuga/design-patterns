package strategypattern;

public class Bin extends Person {

	public Bin() {
		sayStrategy = new NotHungryStrategy();
		eatStrategy = new DontEatStrategy();
	}
}
