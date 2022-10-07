package strategypattern;

public class DontEatStrategy implements EatStrategy {

	@Override
	public void eat() {
		System.out.println("안 먹어!");
	}
}
