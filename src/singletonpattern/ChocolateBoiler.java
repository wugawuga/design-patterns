package singletonpattern;

public class ChocolateBoiler {

	private boolean empty;
	private boolean boiled;

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
