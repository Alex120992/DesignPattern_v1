package deputypattern;

public class NoQuarterState implements State {
    private static final long serialVersionUID = 2L;
    transient GumbalMachine gumBallMachine;

    public NoQuarterState(GumbalMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumBallMachine.setState (gumBallMachine.getHasQuarterState());
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
