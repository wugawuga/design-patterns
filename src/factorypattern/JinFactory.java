package factorypattern;

public class JinFactory implements CutletFactory {
    @Override
    public Cutlet createCutlet() {
        Source source = createSource();
        Oil oil = createOil();
        return new Cutlet();
    }

    @Override
    public Source createSource() {
        System.out.println("나라소스");
        return new JinSource();
    }

    @Override
    public Oil createOil() {
        System.out.println("나라오일");
        return new JinOil();
    }
}
