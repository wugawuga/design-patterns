package strategypattern;

public class MainApplication {
	public static void main(String[] args) {
		Person bin = new Bin();
		bin.say();
		bin.eat();
		System.out.println();

		Person jin = new Jin();
		jin.say();
		jin.setSayStrategy(new HungryStrategy());
		jin.setEatStrategy(new CheeseStrategy());
		jin.say();
		jin.eat();
		System.out.println();

		Person anna = new Anna();
		anna.say();
		anna.setSayStrategy(new HungryStrategy());
		anna.setEatStrategy(new SweetPotatoStrategy());
		anna.say();
		anna.eat();
	}
}
