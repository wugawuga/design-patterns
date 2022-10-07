package strategypattern;

public abstract class Person {

	protected SayStrategy sayStrategy;

	void say() {
		sayStrategy.say();
	}

	abstract void eat();
}
