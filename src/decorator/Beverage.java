package decorator;
// Общий класс для всех основных типов объектов
// Через него мы получаем доступ к декорированным объектам и(или) к главным объектам
public abstract class Beverage {
    String description = "unknow beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}

