package factory_method_2;
/* Клиент для связи кода абрстарктной фабрики с фабричным методом*/
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = // реализация конкретной фабрики  продукта
                new NYPizzaIngredientFactory();


        if (type.equals("cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
        }
//        else if ...
        //etc
        return pizza;
    }
}
