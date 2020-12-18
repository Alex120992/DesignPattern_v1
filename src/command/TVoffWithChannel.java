package command;

public class TVoffWithChannel implements Command {
    Tv tv;

    public TVoffWithChannel(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();

    }

    @Override
    public void undo() {
    tv.on();
    }
}
