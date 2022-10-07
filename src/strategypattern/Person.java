package strategypattern;

public abstract class Person {

	void say() {
		System.out.println("배고파");
	}

	abstract void eat();
}
