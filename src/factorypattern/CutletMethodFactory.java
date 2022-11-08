package factorypattern;

public interface CutletMethodFactory {

    default Cutlet orderCutlet() {
        return createCutlet();
    }

    Cutlet createCutlet();
}
