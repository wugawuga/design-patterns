package factorypattern;

public class WugaCutletStore extends CutletStore {
	public WugaCutletStore(CutletFactory cutletFactory) {
		super(cutletFactory);
	}

	@Override
	Cutlet createCutlet(String type) {
		return cutletFactory.orderCutlet(type);
	}
}
