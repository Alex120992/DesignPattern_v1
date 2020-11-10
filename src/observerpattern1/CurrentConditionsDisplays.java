package observerpattern1;

public class CurrentConditionsDisplays implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    // Регистрация проходит во время создания наблюдателя и созданном наблюдаемым
    public CurrentConditionsDisplays(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + " F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        temperature = temp;
        this.humidity = humidity;
        display();
    }
}
