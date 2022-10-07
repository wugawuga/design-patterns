package strategypattern;

public class MainApplication {
	public static void main(String[] args) {
		Person bin = new Bin();
		bin.say();
		System.out.println();

		Person jin = new Jin();
		jin.say();
		jin.setSayStrategy(new HungryStrategy());
		jin.say();
		jin.eat();
		System.out.println();

		Person anna = new Anna();
		anna.say();
		anna.setSayStrategy(new HungryStrategy());
		anna.say();
		anna.eat();
	}
}
