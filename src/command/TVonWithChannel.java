package command;

public class TVonWithChannel implements Command {
    Tv tv;

    public TVonWithChannel(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
        tv.setChannel (5);
    }

    @Override
    public void undo() {
tv.off();
    }
}
