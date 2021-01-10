package boilerplate_method;

import java.util.Arrays;
/*Общий класс для других классов, которые имеют повторяющийся код
* */
abstract class CaffeineBeverage {
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCoup();
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

}



