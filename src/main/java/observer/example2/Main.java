package observer.example2;

/**
 * 示例 2
 * ---
 * All Rights Reserved by Author
 * Created on 2017/05/14 16:21
 *
 * @author DongYuHui at <a href="dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public class Main {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsConditionsDisplay statisticsConditionsDisplay = new StatisticsConditionsDisplay(weatherData);

        weatherData.setMeasurements(10F, 30F, 50F);
        weatherData.deleteObserver(statisticsConditionsDisplay);
        weatherData.setMeasurements(20F, 40F, 60F);

    }

}
