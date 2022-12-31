package statepattern;

public abstract class State {
    protected Player player;

    public State(Player player) {
        this.player = player;
    }

    abstract void standUp();

    abstract void sitDown();

    abstract void walk();

    abstract void run();

    abstract String getDescription();
}
