package deputypattern;

public class SoldOutState implements State {
    GumbalMachine gumBallMachine;

    public SoldOutState(GumbalMachine gumBallMachine) {
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
