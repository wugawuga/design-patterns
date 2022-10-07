package strategypattern;

public class Jin extends Person {

	public Jin() {
		sayStrategy = new NotHungryStrategy();
		eatStrategy = new DontEatStrategy();
	}
}
