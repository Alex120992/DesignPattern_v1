package factory_method;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Sauce and Cheese Pizza:";
        dough = "Extra thick Crust Dough";
        sauce = "Tomato Sauce";

        toppings.add("Mozzarella cheese");
    }

    @Override
    void cut() {
        System.out.println("Cutting the pizza into square slice");
    }
}