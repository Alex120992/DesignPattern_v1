package deputypattern;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Имитация кода нна стороне сервера*/
public class GumbalMachine extends UnicastRemoteObject implements GumballMachineRemote {
    private static final long serialVersionUID = 2L;
    private  State soldOutState;
    private  State noQuarterState;
    private  State hasQuarterState;
    private  State soldState;

    State state = soldOutState;
    int count = 0;

    private final String location;

    public GumbalMachine(String location,  int count) throws RemoteException {
        this.location = location;
        this.count = count;
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);

        if (count > 0) state = noQuarterState;
    }

    public String getLocation() {
        return location;
    }

    public int getCount() {
        return count;
    }
    void  setState (State state){
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }
}
