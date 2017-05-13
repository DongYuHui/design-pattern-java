package observer.example1;

/**
 * 示例
 * ---
 * All Rights Reserved by Author
 * Created on 2017/05/13 22:30
 *
 * @author DongYuHui at <a href="dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public class Main {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsConditionsDisplay statisticsConditionsDisplay = new StatisticsConditionsDisplay(weatherData);

        weatherData.setMeasurements(10F, 60F, 70F);
        weatherData.removeObserver(statisticsConditionsDisplay);
        weatherData.setMeasurements(7F, 30F, 19F);

    }

}
