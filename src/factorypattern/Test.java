package factorypattern;

public class Test {
    public static void main(String[] args) {

        CutletFactory cutletFactory = new CutletFactory();
        CutletStore wugaStore = new WugaCutletStore(cutletFactory);

        wugaStore.orderCutlet("cheese");
    }
}
