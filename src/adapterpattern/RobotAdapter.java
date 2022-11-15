package adapterpattern;

public class RobotAdapter implements Animal {
    private final Robot robot;

    public RobotAdapter(Robot robot) {
        this.robot = robot;
    }

    @Override
    public String getName() {
        return robot.getModelName();
    }
}
