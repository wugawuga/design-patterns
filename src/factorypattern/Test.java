package factorypattern;

public class Test {
    public static void main(String[] args) {

        CutletMethodFactory wugaFactory = new WugaCutletMethodFactory();
        Cutlet wugaCutlet = wugaFactory.orderCutlet();

        CutletMethodFactory jinFactory = new JinCutletMethodFactory();
        Cutlet jinCutlet = jinFactory.orderCutlet();
    }
}
