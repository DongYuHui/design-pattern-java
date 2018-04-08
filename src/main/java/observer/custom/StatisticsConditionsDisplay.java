package observer.custom;

/**
 * 观察者
 * ---
 * All Rights Reserved by Author
 * Created on 2017/05/13 22:28
 *
 * @author DongYuHui at <a href="dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public class StatisticsConditionsDisplay implements Observer, DisplayElement {

    private float mTemperature;
    private float mPressure;

    public StatisticsConditionsDisplay(Subject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("StatisticsConditionsDisplay: " + "Temperature " + mTemperature + ", Pressure " + mPressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.mTemperature = temp;
        this.mPressure = pressure;
        display();
    }

}
