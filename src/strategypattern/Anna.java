package strategypattern;

public class Anna extends Person {

	public Anna() {
		sayStrategy = new NotHungryStrategy();
		eatStrategy = new DontEatStrategy();
	}
}
