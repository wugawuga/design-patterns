package strategypattern;

public class MainApplication {
	public static void main(String[] args) {
		Bin bin = new Bin();
		bin.eat();

		Jin jin = new Jin();
		jin.eat();

		Anna anna = new Anna();
		anna.eat();
	}
}
