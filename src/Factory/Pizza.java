package Factory;

/* Классический пример реализации фабрики, не паттерна, а идиомы*/
public abstract class Pizza {
    void prepare() {
    }

    void cut() {
    }

    void box() {
    }

    void bake() {

    }
}

class CheesePizza extends Pizza {

}

class ClamPizza extends Pizza {

}

class PepperoniPizza extends Pizza {

}

class VeggiePizza extends Pizza {

}