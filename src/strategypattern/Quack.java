package strategypattern;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Крякает");
    }
}
