package boilerplate_method;

public class Main {
    public static void main(String[] args) {
        CaffeineBeverage tea = new Tea();
        tea.prepareRecipe();
        ////
        CaffeineBeverageWithHook c = new СoffeeHook();
        c.prepareRecipe();

    }
}
