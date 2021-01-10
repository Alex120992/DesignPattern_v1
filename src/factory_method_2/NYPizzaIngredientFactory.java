package factory_method_2;
/* Конкретные  фабрики реализуют конркетные продукты */

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new Garlic(), new Onion(), new Mushroom(), new Redpepper()};
        return veggies;
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
