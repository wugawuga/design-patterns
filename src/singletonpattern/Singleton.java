package singletonpattern;

public class Singleton {
	private static Singleton uniqueInstance;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			synchronized (Singleton.class) {
				if (uniqueInstance == null) {
					return uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}
}
