package strategypattern;

public class HungryStrategy implements SayStrategy {

	@Override
	public void say() {
		System.out.println("배고파");
	}
}
