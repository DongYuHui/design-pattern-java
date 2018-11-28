package observer.java;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 * ---
 * All Rights Reserved by Author
 * Created on 2017/05/14 16:29
 *
 * @author DongYuHui at <a href="dyh920827@gmail.com">dyh920827@gmail.com</a>
 */

@Deprecated
public class StatisticsConditionsDisplay implements Observer, DisplayElement {

    private float mTemperature;
    private float mPressure;

    public StatisticsConditionsDisplay(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData data = (WeatherData) o;
            mTemperature = data.getTemperature();
            mPressure = data.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("StatisticsConditionsDisplay: " + "Temperature " + mTemperature + ", Pressure " + mPressure);
    }

}
