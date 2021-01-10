package factory_method_2;

public interface PizzaIngredientFactory  { //  абстрактная фабрика
    public Dough createDough(); // интерфейс Dough - абстрактный продукт , реализуется конкретный продукт в конкреной фабрике
    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Clams createClams();
}