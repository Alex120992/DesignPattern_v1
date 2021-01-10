package State;

public class SoldOutState implements State {
    GumBallMachineTrueRelease gumBallMachine;

    public SoldOutState(GumBallMachineTrueRelease gumBallMachine) {
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
