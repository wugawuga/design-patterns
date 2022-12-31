package statepattern;

public class WalkState extends State {

    public WalkState(Player player) {
        super(player);
    }

    @Override
    void standUp() {
        player.setSpeed(0);
        player.talk("멈춰");
        player.setState(new StandUpState(player));
    }

    @Override
    void sitDown() {
        player.setSpeed(0);
        player.talk("걷다가 앉으면 넘어질 수 있어요");
        player.setState(new SitDownState(player));
    }

    @Override
    void walk() {
        player.talk("걷는게 좋아");
    }

    @Override
    void run() {
        player.setSpeed(20);
        player.talk("걷다가 뛰면 빨리 뛸 수 있지");
        player.setState(new RunState(player));
    }

    @Override
    String getDescription() {
        return "걷는 중";
    }


}
