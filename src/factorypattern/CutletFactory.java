package factorypattern;

public interface CutletFactory {
    Cutlet createCutlet();

    Source createSource();

    Oil createOil();
}
