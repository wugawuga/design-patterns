package strategypattern;

public class SweetPotatoStrategy implements EatStrategy {

	@Override
	public void eat() {
		System.out.println("고구마 돈까스!");
	}
}
