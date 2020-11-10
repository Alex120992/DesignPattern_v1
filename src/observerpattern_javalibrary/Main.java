package observerpattern_javalibrary;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(); //  Observable
        CurrentConditionsDisplays currentDisplay = new CurrentConditionsDisplays(weatherData); //  Observer

        weatherData.setMeasurements(80,65, 30.5F);
        weatherData.setMeasurements(89,60, 20.5F);
        weatherData.setMeasurements(70,55, 34.3F);
    }
}
