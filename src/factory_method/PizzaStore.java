package factory_method;



public abstract class PizzaStore {
    public final Pizza orderPizza(String type) {
        Pizza pizza;                // используется слабосвзность
        pizza = createPizza(type);  //  создание пиццы с помощью абстарктного метода
        // что позволяет нам
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract Pizza createPizza(String type); // фабричный метод, который действует как фпбрика и
    // отвечает в подклассах за создание
    // нужного типа пиццы
}
