package State;

public class SoldState implements State {
    GumBallMachineTrueRelease gumBallMachine;

    public SoldState(GumBallMachineTrueRelease gumBallMachine) {
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

