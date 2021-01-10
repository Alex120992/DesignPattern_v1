package boilerplate_method;

public class Coffee extends CaffeineBeverage {

    @Override
    protected void addCondiments() {
        System.out.println("add sugar");
    }

    @Override
    protected void brew() {
        System.out.println("Dripping coffee through filter");
    }
}
