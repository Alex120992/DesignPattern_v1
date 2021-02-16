package deputypattern;

import java.io.Serializable;

public interface State extends Serializable {
    void insertQuarter();
    void ejectQuarter();
    void turnQuarter();
    void dispense();
}
