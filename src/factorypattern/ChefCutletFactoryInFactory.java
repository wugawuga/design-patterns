package factorypattern;

public class ChefCutletFactoryInFactory implements CutletFactoryInFactory {
    @Override
    public CutletFactory request(String chef) {
        switch (chef) {
            case "wuga":
                return new WugaFactory();
            case "jin":
                return new JinFactory();
        }
        throw new IllegalArgumentException();
    }
}
