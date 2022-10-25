package singletonpattern;

public class Singleton {
	private static Singleton uniqueInstance;

	private Singleton() {
	}

	public static synchronized Singleton getInstance() {
		if (uniqueInstance == null) {
			return uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
}
