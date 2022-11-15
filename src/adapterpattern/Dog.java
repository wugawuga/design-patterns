package adapterpattern;

public class Dog implements Animal {
    private final String name = "강아지";

    @Override
    public String getName() {
        return name;
    }
}
