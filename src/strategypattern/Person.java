package strategypattern;

public class Person {

	protected SayStrategy sayStrategy;

	protected EatStrategy eatStrategy;

	void say() {
		sayStrategy.say();
	}

	void eat() {
		eatStrategy.eat();
	}

	void setSayStrategy(SayStrategy sayStrategy) {
		this.sayStrategy = sayStrategy;
	}

	void setEatStrategy(EatStrategy eatStrategy) {
		this.eatStrategy = eatStrategy;
	}
}
