package statepattern;

public class SitDownState extends State {

    public SitDownState(Player player) {
        super(player);
    }

    @Override
    void standUp() {
        player.setState(new StandUpState(player));
        player.talk("일어나자");
    }

    @Override
    void sitDown() {
        player.talk("계속 앉아있네");
    }

    @Override
    void walk() {
        player.talk("앉아서 못 걸으니 일단 서자");
        player.setState(new StandUpState(player));
    }

    @Override
    void run() {
        player.talk("앉아서 못 뛰니 일단 서자");
        player.setState(new RunState(player));
    }

    @Override
    String getDescription() {
        return "앉아있음";
    }
}
