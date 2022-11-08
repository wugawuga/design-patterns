package factorypattern;

public class JinCutletMethodFactory implements CutletMethodFactory {

    @Override
    public Cutlet createCutlet() {
        System.out.println("나라공장");
        return new Cutlet();
    }
}
