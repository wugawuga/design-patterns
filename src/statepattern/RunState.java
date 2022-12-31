package statepattern;

public class RunState extends State {

    public RunState(Player player) {
        super(player);
    }

    @Override
    void standUp() {
        player.talk("뛰다가 서면 다쳐");
        player.setSpeed(0);
        player.setState(new StandUpState(player));
    }

    @Override
    void sitDown() {
        player.talk("뛰다가 앉으라고?");
        player.setSpeed(0);
        player.setState(new StandUpState(player));
    }

    @Override
    void walk() {
        player.talk("속도를 줄일게요");
        player.setSpeed(8);
        player.setState(new WalkState(player));
    }

    @Override
    void run() {
        player.talk("더 빨리 뛰라는 얘기지?");
        player.setSpeed(player.getSpeed() + 2);
    }

    @Override
    String getDescription() {
        return "뛰는 중";
    }
}
