package strategypattern;

/* Поведения у нас являются сущностями
 * Используя полиморфизм мы отказываемся от жесткой связки с конкретным объектом
 * Каждый вид поведения реализует интерфейс общего поведения
 * каждый аспект размещается в абстрактном классе, и настраивается через сеттеры*/
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void perform() {
        quackBehavior.quack();
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }
  public void swim(){
    System.out.println("All ducks float, even decoys");
  }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
