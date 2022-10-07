package strategypattern;

public class NotHungryStrategy implements SayStrategy {

	@Override
	public void say() {
		System.out.println("배 안고파!");
	}
}
