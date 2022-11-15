package adapterpattern;

public class Cat implements Animal {
    private final String name = "고양이";

    @Override
    public String getName() {
        return name;
    }
}
