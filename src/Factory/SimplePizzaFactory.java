package Factory;

public class SimplePizzaFactory {
    public Pizza createPizza(String typePizza) {
        Pizza pizza = null;

        if (typePizza.equals("cheese")) pizza = new CheesePizza();
        else if (typePizza.equals("pepperoni")) pizza = new PepperoniPizza();
        else if (typePizza.equals("clam")) pizza = new ClamPizza();
        else if (typePizza.equals("veggie")) pizza = new VeggiePizza();
        return pizza;
    }
}


