package strategypattern;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Я лечу как ракета");
    }
}
