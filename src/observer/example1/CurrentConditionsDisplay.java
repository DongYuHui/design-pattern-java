package observer.example1;

/**
 * 观察者
 * ---
 * All Rights Reserved by Author
 * Created on 2017/05/13 22:24
 *
 * @author DongYuHui at <a href="dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float mTemperature;
    private float mHumidity;

    public CurrentConditionsDisplay(Subject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("CurrentConditionsDisplay: " + "Temperature " + mTemperature + ", Humidity " + mHumidity);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.mTemperature = temp;
        this.mHumidity = humidity;
        display();
    }

}
