package factory_method;

public class TestPizza {
    public static void main(String[] args) {
        PizzaStore ns = new NYStylePizzaStore();
        PizzaStore cs = new ChicagoStylePizzaStore();

        Pizza pizza = ns.orderPizza("cheese");
        System.out.println(pizza.getName()+"\n");
        pizza = cs.orderPizza("cheese");
        System.out.println(pizza.getName());

    }
}
