package singletonpattern;

public class Singleton {
	private static Singleton unique;

	public Singleton() {
	}

	public static Singleton getInstance() {
		if (unique == null) {
			unique = new Singleton();
		}
		return unique;
	}
}
