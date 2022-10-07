package strategypattern;

public class CheeseStrategy implements EatStrategy {

	@Override
	public void eat() {
		System.out.println("치즈 돈까스!");
	}
}
