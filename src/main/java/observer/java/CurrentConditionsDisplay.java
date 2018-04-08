package observer.java;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 * ---
 * All Rights Reserved by Author
 * Created on 2017/05/14 16:26
 *
 * @author DongYuHui at <a href="dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float mTemperature;
    private float mHumidity;

    public CurrentConditionsDisplay(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData data = (WeatherData) o;
            mTemperature = data.getTemperature();
            mHumidity = data.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("CurrentConditionsDisplay: " + "Temperature " + mTemperature + ", Humidity " + mHumidity);
    }

}
