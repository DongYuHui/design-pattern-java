import org.junit.Test;

/**
 * 观察者模式测试
 * ---
 * Created on 2018/4/8 17:04
 * All Rights Reserved by Author
 *
 * @author DongYuHui at <a href="mailto:dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public class ObserverTest {

    @Test
    public void testObserverCustom() {

        observer.custom.WeatherData weatherData = new observer.custom.WeatherData();

        observer.custom.CurrentConditionsDisplay currentConditionsDisplay = new observer.custom.CurrentConditionsDisplay(weatherData);
        observer.custom.StatisticsConditionsDisplay statisticsConditionsDisplay = new observer.custom.StatisticsConditionsDisplay(weatherData);

        weatherData.setMeasurements(10F, 60F, 70F);
        weatherData.removeObserver(statisticsConditionsDisplay);
        weatherData.setMeasurements(7F, 30F, 19F);
        weatherData.removeObserver(currentConditionsDisplay);
        weatherData.setMeasurements(3F, 50F, 23F);

    }

    @Test
    public void testObserverJava() {

        observer.java.WeatherData weatherData = new observer.java.WeatherData();

        observer.java.CurrentConditionsDisplay currentConditionsDisplay = new observer.java.CurrentConditionsDisplay(weatherData);
        observer.java.StatisticsConditionsDisplay statisticsConditionsDisplay = new observer.java.StatisticsConditionsDisplay(weatherData);

        weatherData.setMeasurements(10F, 30F, 50F);
        weatherData.deleteObserver(statisticsConditionsDisplay);
        weatherData.setMeasurements(20F, 40F, 60F);
        weatherData.deleteObserver(currentConditionsDisplay);
        weatherData.setMeasurements(3F, 50F, 23F);

    }

}
