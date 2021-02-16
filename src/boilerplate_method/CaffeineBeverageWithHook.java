package boilerplate_method;

/*Общий класс для других классов, которые имеют повторяющийся код
 * */
abstract class CaffeineBeverageWithHook {
    // шаблонный метод рецепта
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCoup();
        if (customerWantsCondiments())
            addCondiments();
    }

    protected abstract void addCondiments();

    private void pourInCoup() {
        System.out.println("Налить напиток");
    }

    protected abstract void brew();

    private void boilWater() {
        System.out.println("Вскипятить воду");
    }

    /* метод перехватчик */
    protected boolean customerWantsCondiments() {
        return true;
    }

}



