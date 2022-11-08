package factorypattern;

public class WugaFactory implements CutletFactory {
    @Override
    public Cutlet createCutlet() {
        Source source = createSource();
        Oil oil = createOil();
        return new Cutlet();
    }

    @Override
    public Source createSource() {
        System.out.println("우가소스");
        return new WugaSource();
    }

    @Override
    public Oil createOil() {
        System.out.println("우가오일");
        return new WugaOil();
    }
}
