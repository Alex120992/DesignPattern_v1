package decorator;
/* Декораторы работают по тому же принципу что и рекурсии
* Декораторы оборачивают основные объекты*/

public class Main {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " $" + espresso.cost());

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Soy(darkRoast);
        System.out.println(darkRoast.getDescription() + " $" + darkRoast.cost());
    }
}
