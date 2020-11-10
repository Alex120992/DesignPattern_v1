package observerpattern1;

public interface Subject {

    //Наблюдаемое содержит метод регистрации, удаления, уведомления наблюдателей

    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();
}

