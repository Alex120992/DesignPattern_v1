package deputypattern;

public class HasQuarterState implements State {
    GumbalMachine gumBallMachine;

    public HasQuarterState(GumbalMachine gumBallMachine) {
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
