package adapterpattern;

public class RobotTiger implements Robot {
    private final String name = "로봇호랑이";

    @Override
    public String getModelName() {
        return name;
    }
}
