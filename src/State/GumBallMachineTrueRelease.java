package State;

/**
 * Глупая реализация жвачного автомата с  состояниеми
 */
public class GumBallMachineTrueRelease {

    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;

    State state = soldOutState;
    int count = 0;

    public GumBallMachineTrueRelease(int count) {
        this.count = count;
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);

        if (count > 0) state = noQuarterState;
    }
    public  void insert (){
        state.insertQuarter();
    }
    public void ejectQuarter (){
        state.ejectQuarter();
    }
    /**
     * В дальнейшем испоьются те же методы что и в интерфейсе
     * */

    void  setState (State state){
        this.state = state;
    }
}
