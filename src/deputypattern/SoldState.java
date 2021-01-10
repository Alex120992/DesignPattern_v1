package deputypattern;

public class SoldState implements State {
    GumbalMachine gumBallMachine;

    public SoldState(GumbalMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }

    @Override
    public void insertQuarter() {

    }

    @Override
    public void ejectQuarter() {

    }

    @Override
    public void turnQuarter() {

    }

    @Override
    public void dispense() {

    }
}

