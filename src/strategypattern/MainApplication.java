package strategypattern;

public class MainApplication {
	public static void main(String[] args) {
		Person bin = new Bin();
		bin.say();
		bin.eat();

		Person jin = new Jin();
		jin.say();
		jin.eat();

		Person anna = new Anna();
		anna.say();
		anna.eat();
	}
}
