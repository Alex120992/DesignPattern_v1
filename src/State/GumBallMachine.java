package State;

/**
 * Глупая реализация жвачного автомата с  состояниеми
 */
public class GumBallMachine {

    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;

    public GumBallMachine(int count) {
        this.count = count;
        if (count > 0) state = NO_QUARTER;
    }

    public void insertQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("You can't insert another quarter");
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("You inserted a quarter");
        } else if (state == SOLD_OUT)
            System.out.println("You can't insert a quarter, the machine is sold out");
        else if (state == SOLD)
            System.out.println("Please wait for, we are alredy givivng you a gumball ");
    }

    public void ejectQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("Quarter returned");
            state = NO_QUARTER;
        } else if (state == NO_QUARTER) {
            System.out.println("You haven't inserted a quarter");
        } else if (state == SOLD_OUT)
            System.out.println("You can't reject quarter, you haven't inserted a quarter yet");
        else if (state == SOLD)
            System.out.println("You already turned the crank");
    }

    public void turnCrank() {
        if (state == HAS_QUARTER) {
            System.out.println("You can't insert another quarter");
            state = SOLD;
            dispense();
        } else if (state == NO_QUARTER) {

            System.out.println("turned crunk, but no quarter");
        } else if (state == SOLD_OUT)
            System.out.println("You turned, but there are no gumballs");
        else if (state == SOLD)
            System.out.println("Turning twice the crunk you don't get another gumball ");
    }

    private void dispense() {
    }


}
