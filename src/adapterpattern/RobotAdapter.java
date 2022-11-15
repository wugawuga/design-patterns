package adapterpattern;

public class RobotAdapter implements Animal {
    private final RobotTiger robotTiger;

    public RobotAdapter(RobotTiger robotTiger) {
        this.robotTiger = robotTiger;
    }

    @Override
    public String getName() {
        return robotTiger.getName();
    }
}
