package observerpattern_javalibrary;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplays implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Observable weatherData;

    // Регистрация проходит во время создания наблюдателя и созданном наблюдаемым
    public CurrentConditionsDisplays(Observable weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + " F degrees and " + humidity + "% humidity");
    }


    @Override
    public void update(Observable observable, Object o) {
        if (observable instanceof WeatherData ){
            WeatherData weatherData = (WeatherData) observable;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
