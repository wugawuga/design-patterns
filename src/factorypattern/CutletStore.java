package factorypattern;

public abstract class CutletStore {
	CutletFactory cutletFactory;

	public CutletStore(CutletFactory cutletFactory) {
		this.cutletFactory = cutletFactory;
	}

	Cutlet orderCutlet(String type) {
		Cutlet cutlet = null;

		cutlet = createCutlet(type);

		return cutlet;
	}

	abstract Cutlet createCutlet(String type);
}
