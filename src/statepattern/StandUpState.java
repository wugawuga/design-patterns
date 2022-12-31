package statepattern;

public class StandUpState extends State {

    public StandUpState(Player player) {
        super(player);
    }

    @Override
    void standUp() {
        player.talk("언제 움직여?");
    }

    @Override
    void sitDown() {
        player.setState(new SitDownState(player));
        player.talk("앉으니까 편해요");
    }

    @Override
    void walk() {
        player.setSpeed(5);
        player.setState(new WalkState(player));
        player.talk("걷기는 아주 좋아요");
    }

    @Override
    void run() {
        player.setSpeed(10);
        player.setState(new RunState(player));
        player.talk("뛰니까 힘들어");
    }

    @Override
    String getDescription() {
        return "제자리에 서 있어요";
    }
}
