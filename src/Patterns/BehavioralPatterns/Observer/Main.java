package Patterns.BehavioralPatterns.Observer;

/**
 * Observer - designed to create a subscription mechanism that allows one objects (observers) to monitor
 * and respond to events occurring in other objects (subjects).
 * This pattern is widely used to implement a distributed event system in software,
 * especially in user interface development, where changes in one object
 * require automatic updates in other objects.
 */

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(26.6f, 65f, 1013.1f);
        weatherData.setMeasurements(27.7f, 70f, 997.0f);
    }
}
