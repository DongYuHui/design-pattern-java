package observer.custom;

import java.util.ArrayList;
import java.util.List;

/**
 * 气象主题
 * ---
 * All Rights Reserved by Author
 * Created on 2017/05/13 22:16
 *
 * @author DongYuHui at <a href="dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public class WeatherData implements Subject {

    private List<Observer> mObservers;

    private float mTemperature;
    private float mHumidity;
    private float mPressure;

    public WeatherData() {
        mObservers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        mObservers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = mObservers.indexOf(observer);
        if (index >= 0) {
            mObservers.remove(index);
        }
    }

    @Override
    public void updateAll() {
        for (Observer observer : mObservers) {
            observer.update(mTemperature, mHumidity, mPressure);
        }
    }

    /**
     * 当从气象站得到更新观测值时，我们通知观察者
     */
    public void measurementsChanged() {
        System.out.println("--- WeatherData changed ---");
        updateAll();
    }

    /**
     * 设置气象数据，并更新
     *
     * @param temperature 温度
     * @param humidity    湿度
     * @param pressure    气压
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.mTemperature = temperature;
        this.mHumidity = humidity;
        this.mPressure = pressure;
        measurementsChanged();
    }

}
