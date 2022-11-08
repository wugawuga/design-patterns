package factorypattern;

public class WugaCutletMethodFactory implements CutletMethodFactory {

    @Override
    public Cutlet createCutlet() {
        System.out.println("정욱공장");
        return new Cutlet();
    }
}
