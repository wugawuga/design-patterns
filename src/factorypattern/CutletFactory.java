package factorypattern;

public class CutletFactory {

	Cutlet orderCutlet(String type) {
		Cutlet cutlet = null;

		if (type.equals("cheese")) {
			cutlet = new CheeseCutlet();
		} else if (type.equals("sweetPotato")) {
			cutlet = new SweetPotatoCutlet();
		}

		return cutlet;
	}
}
