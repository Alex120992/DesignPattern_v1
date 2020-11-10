package strategypattern;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I'm not quack");
    }
}