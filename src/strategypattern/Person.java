package strategypattern;

public abstract class Person {

	protected SayStrategy sayStrategy;

	void say() {
		sayStrategy.say();
	}

	void setSayStrategy(SayStrategy sayStrategy) {
		this.sayStrategy = sayStrategy;
	}

	abstract void eat();
}
