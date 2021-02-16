package Singleton;
// слздается только когда для класса нужен один экземпляр
public class Singleton {
    private static Singleton instance;

    private Singleton(){

    }
    public static Singleton getInstance(){
        if (instance == null) instance = new Singleton();
        return instance;
    }
}
