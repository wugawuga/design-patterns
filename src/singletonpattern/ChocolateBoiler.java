package singletonpattern;

public class ChocolateBoiler {

	private static ChocolateBoiler chocolateBoiler;
	private boolean empty;
	private boolean boiled;

	public static ChocolateBoiler getInstance() {
		if (chocolateBoiler == null) {
			chocolateBoiler = new ChocolateBoiler();
		}
		return chocolateBoiler;
	}

	private ChocolateBoiler() {
		this.empty = true;
		this.boiled = false;
	}

	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
		}
	}

	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			// 재료를 끓임
			boiled = true;
		}
	}

	private boolean isBoiled() {
		return boiled;
	}

	private boolean isEmpty() {
		return empty;
	}
}
