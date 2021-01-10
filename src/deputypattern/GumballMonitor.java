package deputypattern;
/**
 * Имимтация  Кода на стороне клиента*/
public class GumballMonitor {
    GumbalMachine machine;
    State state;
    public GumballMonitor(GumbalMachine machine) {
        this.machine = machine;
    }

    public void report () {
        System.out.println("Gumball Machine: + "+machine.getLocation());
        System.out.println("Current  Inventory: + "+machine.getCount()+ "gumball");
        System.out.println("Current state: + "+machine.getState());
    }
}
