package factorypattern;

public class CutletStore {
	CutletFactory cutletFactory;

	public CutletStore(CutletFactory cutletFactory) {
		this.cutletFactory = cutletFactory;
	}

	Cutlet orderCutlet(String type) {
		Cutlet cutlet = null;

		cutlet = cutletFactory.orderCutlet(type);

		return cutlet;
	}
}
