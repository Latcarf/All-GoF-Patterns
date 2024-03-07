package Patterns.BehavioralPatterns.Observer;

/**
 * Observer - предназначен для создания механизма подписки, позволяющего одним объектам (наблюдателям) следить
 * и реагировать на события, происходящие в других объектах (субъектах).
 * Этот паттерн широко используется для реализации распределенной системы событий в программном обеспечении,
 * особенно в разработке пользовательских интерфейсов, где изменения в одном объекте
 * требуют автоматического обновления в других объектах.
 */

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(26.6f, 65f, 1013.1f);
        weatherData.setMeasurements(27.7f, 70f, 997.0f);
    }
}
