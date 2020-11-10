package strategypattern;

public class FlyWithWings  implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("Утка летит");
    }
}
