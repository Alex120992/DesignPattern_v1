package State;

public class NoQuarterState implements State {
    GumBallMachineTrueRelease gumBallMachine;

    public NoQuarterState(GumBallMachineTrueRelease gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumBallMachine.setState (gumBallMachine.());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("");
    }

    @Override
    public void turnQuarter() {
        System.out.println();
    }

    @Override
    public void dispense() {
        System.out.println();
    }
}
