package factorypattern;

public class Test {
    public static void main(String[] args) {

        CutletFactoryInFactory factoryInFactory = new ChefCutletFactoryInFactory();

        CutletFactory cutletFactory = factoryInFactory.request("wuga");
        cutletFactory.createOil();
        cutletFactory.createSource();
    }
}
